package com.pw.test.spring.boot.data.jpa.redis;

import com.alibaba.fastjson.JSON;
import com.pw.test.spring.boot.data.jpa.redis.entity.UserRightsRechargeRecord;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by pengwei
 * 2017/8/30.
 * Spring Jdbc Template Test Case
 */
public class JdbcTemplateTest extends BaseTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test0() {
        System.out.println(jdbcTemplate);
    }

    @Test
    public void test1() {
        final String sql = "SELECT * FROM user_rights_recharge_record WHERE id = 787";
        UserRightsRechargeRecord record = (UserRightsRechargeRecord) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(UserRightsRechargeRecord.class));
        System.out.println(JSON.toJSONString(record));
    }

    @Test
    public void test2() {
        final String sql = "SELECT * FROM user_rights_recharge_record";
        List<UserRightsRechargeRecord> userRightsRechargeRecords = jdbcTemplate.query(sql, new BeanPropertyRowMapper(UserRightsRechargeRecord.class));
        System.out.println(JSON.toJSONString(userRightsRechargeRecords));
    }

    @Test
    public void test3() {
    }

    @Test
    public void test4() {
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
