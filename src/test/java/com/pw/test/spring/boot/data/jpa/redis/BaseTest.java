package com.pw.test.spring.boot.data.jpa.redis;

import com.alibaba.fastjson.JSON;
import com.pw.test.spring.boot.data.jpa.redis.entity.UserRightsRechargeRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by pengwei
 * 2017/8/30.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseTest {

    @Test
    public void test2() {
        System.out.println("------------- Base Test ---------");
    }

}
