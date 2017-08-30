package com.pw.test.spring.boot.data.jpa.redis.task;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by pengwei
 * 2017/8/30.
 * 定时任务
 */
@Component
public class PrintlnTimeTask {

    public Log logger = LogFactory.getLog(PrintlnTimeTask.class);

    @Scheduled(cron = "0/5 * * * * ?")
    public void println(){
        String str = "----> " + System.currentTimeMillis();
        System.out.println(str);
        logger.info(str);
    }

}
