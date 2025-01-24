package com.mahi.JobApp.service;

import com.mahi.JobApp.model.JobPost;
import com.mahi.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepo jobRepo;

    public List<JobPost> returnAllJobPosts(){
        return jobRepo.returnAllJobPosts();
    }

    public void addJobsPost(JobPost jobPost) {
        jobRepo.addJobsPost(jobPost);
    }

}
