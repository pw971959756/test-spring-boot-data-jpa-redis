package com.pw.test.spring.boot.data.jpa.redis.controller;

import com.pw.test.spring.boot.data.jpa.redis.entity.UserRightsRechargeRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.UUID;

/**
 * Created by pengwei
 * 2017/8/30.
 *  控制器
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @ResponseBody
    @RequestMapping("/")
    public String welcome(){
        return "Hello Wolrd !~ 请访问页面: /index ";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/redis")
    public String redis(){
        String string = UUID.randomUUID().toString();
        stringRedisTemplate.opsForValue().set("T1->",string);
        UserRightsRechargeRecord record = new UserRightsRechargeRecord();
        record.setCreateTime(new Date());
        record.setStatus(10086);
        record.setId(123);
        record.setUserId(789);
        redisTemplate.opsForValue().set("T2->",record);

        return string;
    }

    @ResponseBody
    @RequestMapping("/session")
    public String session(HttpSession session){
        String uuid = UUID.randomUUID().toString();

        UserRightsRechargeRecord record = new UserRightsRechargeRecord();
        record.setCreateTime(new Date());
        record.setStatus(10086);
        record.setId(123);
        record.setUserId(789);

        session.setAttribute("uuid",uuid);
        session.setAttribute("UserRightsRechargeRecord",record);
        return uuid;
    }


    @ResponseBody
    @RequestMapping("divide")
    public int divide(){
        return 10 / 0;
    }
}
