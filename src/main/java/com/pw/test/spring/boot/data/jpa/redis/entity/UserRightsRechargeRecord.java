/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pw.test.spring.boot.data.jpa.redis.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author pengwei
 *  实体类
 */
@Data
@Entity
@DynamicUpdate // 不修改全部列
@DynamicInsert // 不插入全部列
@Table(name = "user_rights_recharge_record")
public class UserRightsRechargeRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "relation_id")
    private Integer relationId;
    @Column(name = "type")
    private Integer type;
    @Column(name = "alter_count")
    private Integer alterCount;
    @Column(name = "gift_count")
    private Integer giftCount;
    @Column(name = "current_count")
    private Integer currentCount;
    @Column(name = "item")
    private Integer item;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private Integer status;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;


}
