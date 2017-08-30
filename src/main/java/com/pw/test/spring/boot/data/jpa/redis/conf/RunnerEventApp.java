package com.pw.test.spring.boot.data.jpa.redis.conf;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * Created by pengwei
 * 2017/8/30.
 *  启动加载事件
 */
@Component
public class RunnerEventApp implements CommandLineRunner {

    private static final Log logger = LogFactory.getLog(CustomHandlerExceptionResolver.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("Spring Boot Start Load Event ->  Hello World !~");
    }
}