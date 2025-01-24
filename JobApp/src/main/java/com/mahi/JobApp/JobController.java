package com.mahi.JobApp;

import com.mahi.JobApp.model.JobPost;
import com.mahi.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addjob()
    {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addJobsPost(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewjobs(Model m){
        List<JobPost> jobs= jobService.returnAllJobPosts();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }
}
