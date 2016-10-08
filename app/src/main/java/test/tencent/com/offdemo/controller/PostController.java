package test.tencent.com.offdemo.controller;


import com.birbit.android.jobqueue.JobManager;
import com.birbit.android.jobqueue.config.Configuration;

import test.tencent.com.offdemo.App;
import test.tencent.com.offdemo.job.BaseJob;
import test.tencent.com.offdemo.job.PostJob;

/**
 * Created by hoollyzhang on 16/9/28.
 * Description :
 */

public class PostController {

    private JobManager mJobManager;

    public PostController() {
        Configuration configuration = new Configuration.Builder(App.ApplicationContext()).build();
        this.mJobManager = new JobManager(configuration);
    }

    public void newPost(String content) {
        mJobManager.addJobInBackground(new PostJob(BaseJob.BACKGROUND, content));
    }
}