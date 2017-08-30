package com.pw.test.spring.boot.data.jpa.redis;

import com.alibaba.fastjson.JSON;
import com.pw.test.spring.boot.data.jpa.redis.entity.UserRightsRechargeRecord;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Created by pengwei
 * 2017/8/30.
 *  Redis Test Case
 */
public class RedisTest extends BaseTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test0() {
        System.out.println(stringRedisTemplate);
        System.out.println(redisTemplate);
    }

    @Test
    public void test1() {
        stringRedisTemplate.opsForValue().set("hello","world !~");
    }

    @Test
    public void test2() {
        UserRightsRechargeRecord userRightsRechargeRecord = new UserRightsRechargeRecord();
        userRightsRechargeRecord.setUserId(123);
        userRightsRechargeRecord.setDescription("中国人难啊");
        redisTemplate.opsForValue().set("test2",userRightsRechargeRecord);
    }

    @Test
    public void test3() {
        System.out.println(stringRedisTemplate.opsForValue().get("hello"));
    }

    @Test
    public void test4() {
        System.out.println(JSON.toJSONString(redisTemplate.opsForValue().get("test2")));
    }

    @Test
    public void test5() {
    }

    @Test
    public void test6() {
    }

    @Test
    public void test7() {
    }

    @Test
    public void test8() {
    }

    @Test
    public void test9() {
    }

}
