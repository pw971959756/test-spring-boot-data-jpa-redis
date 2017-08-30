package com.pw.test.spring.boot.data.jpa.redis;

import com.alibaba.fastjson.JSON;
import com.pw.test.spring.boot.data.jpa.redis.entity.UserRightsRechargeRecord;
import com.pw.test.spring.boot.data.jpa.redis.repository.UserRightsRechargeRecordRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pengwei
 * 2017/8/30.
 *  Spring Boot Repository Test Case
 */
public class RepositoryTest extends BaseTest {

    @Autowired
    private UserRightsRechargeRecordRepository rightsRechargeRecordRepository;

    /**
     * 单条插入
     */
    @Test
    public void test0() {
        UserRightsRechargeRecord record = new UserRightsRechargeRecord();
        record.setUserId(1008611);
        record.setDescription("Junit Test");
        rightsRechargeRecordRepository.save(record);
    }

    /**
     * 指定ID 查询
     */
    @Test
    public void test1() {
        System.out.println(JSON.toJSONString(rightsRechargeRecordRepository.findOne(797)));
    }

    /**
     * 查询所有
     */
    @Test
    public void test2() {
        System.out.println(JSON.toJSONString(rightsRechargeRecordRepository.findAll()));
    }

    /**
     * 修改
     */
    @Test
    public void test3() {
        UserRightsRechargeRecord record = rightsRechargeRecordRepository.findOne(788);
        record.setDescription(record.getDescription() + "Junit Update");
        System.out.println(JSON.toJSONString(rightsRechargeRecordRepository.save(record)));
    }

    /**
     * 删除
     */
    @Test
    public void test4() {
        UserRightsRechargeRecord record = rightsRechargeRecordRepository.findOne(789);
        rightsRechargeRecordRepository.delete(record.getId());
    }

    /**
     * 批量插入
     *      不建议使用，最终执行SQL
     *          Hibernate: insert into user_rights_recharge_record (description, user_id) values (?, ?)
                Hibernate: insert into user_rights_recharge_record (description, user_id) values (?, ?)
     */
    @Test
    public void test5() {
        UserRightsRechargeRecord record1 = new UserRightsRechargeRecord();
        UserRightsRechargeRecord record2 = new UserRightsRechargeRecord();

        record1.setUserId(123);
        record1.setDescription("123");

        record2.setUserId(456);
        record2.setDescription("456");

        List<UserRightsRechargeRecord> list = Arrays.asList(new UserRightsRechargeRecord[]{record1,record2});
        rightsRechargeRecordRepository.save(list);

    }




}
