package com.example.demo.job;

import java.util.Date;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;   
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;  
  
public class MyJob implements BaseJob {  
  
    private static Logger _log = LoggerFactory.getLogger(MyJob.class);  
     
    public MyJob() {  
          
    }  
     
    public void execute(JobExecutionContext context)  
        throws JobExecutionException {  
        _log.error("my Job执行时间: " + new Date());  
          
    }  
}  
