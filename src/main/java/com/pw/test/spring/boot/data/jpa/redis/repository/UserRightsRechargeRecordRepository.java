package com.pw.test.spring.boot.data.jpa.redis.repository;

import com.pw.test.spring.boot.data.jpa.redis.entity.UserRightsRechargeRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DOC: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
 * <p>
 * <pre>
 *  JPA 方法，访问链接: http://localhost:8085/userRightsRechargeRecords
 *
 *      JPA 增加 提交方式 POST -> ：http://localhost:8085/userRightsRechargeRecords
 *                 Headers: Content-Type:application/hal+json;charset=UTF-8
 *                 parameters: { "userId" : 11, "description" : "德玛西亚" }
 *                 返回Status Code:201
 *
 *                 返回结果:
 *                          {
 *                            "userId" : 11333,
 *                            "relationId" : null,
 *                            "type" : null,
 *                            "alterCount" : null,
 *                            "giftCount" : null,
 *                            "currentCount" : null,
 *                            "item" : null,
 *                            "description" : "德玛11",
 *                            "status" : null,
 *                            "createTime" : null,
 *                            "updateTime" : null,
 *                            "_links" : {
 *                                "self" : {
 *                                    "href" : "http://localhost:8085/userRightsRechargeRecords/808"
 *                                    },
 *                                "userRightsRechargeRecord" : {
 *                                    "href" : "http://localhost:8085/userRightsRechargeRecords/808"
 *                                    }
 *                               }
 *                            }
 *
 *      JPA 删除 提交方式 DELETE -> ：http://localhost:8085/userRightsRechargeRecords/785
 *                  返回Status Code:204
 *
 *                  返回结果: null
 *
 *
 *      JPA 修改 提交方式 PUT -> : http://localhost:8085/userRightsRechargeRecords/808
 *                 Headers: Content-Type:application/hal+json;charset=UTF-8
 *                 parameters: { "userId" : 11, "description" : "德玛西亚" }
 *                 返回Status Code:201
 *
 *                 返回结果：
 *                          {
 *                           "userId" : 123,
 *                            "relationId" : null,
 *                            "type" : null,
 *                            "alterCount" : null,
 *                            "giftCount" : null,
 *                            "currentCount" : null,
 *                            "item" : null,
 *                            "description" : "GG",
 *                            "status" : null,
 *                            "createTime" : null,
 *                            "updateTime" : null,
 *                           "_links" : {
 *                               "self" : {
 *                                   "href" : "http://localhost:8085/userRightsRechargeRecords/811"
 *                                   },
 *                               "userRightsRechargeRecord" : {
 *                                   "href" : "http://localhost:8085/userRightsRechargeRecords/811"
 *                                   }
 *                               }
 *                           }
 *
 *
 *      JPA 查询 提交方式 GET -> : http://localhost:8085/userRightsRechargeRecords/808
 *                  返回Status Code:200
 *
 *                  返回结果：
 *                          {
 *                           "userId" : 123,
 *                           "relationId" : null,
 *                           "type" : null,
 *                           "alterCount" : null,
 *                           "giftCount" : null,
 *                           "currentCount" : null,
 *                           "item" : null,
 *                           "description" : "GG",
 *                           "status" : null,
 *                           "createTime" : null,
 *                           "updateTime" : null,
 *                           "_links" : {
 *                               "self" : {
 *                                   "href" : "http://localhost:8085/userRightsRechargeRecords/811"
 *                                   },
 *                               "userRightsRechargeRecord" : {
 *                                   "href" : "http://localhost:8085/userRightsRechargeRecords/811"
 *                                   }
 *                               }
 *                           }
 *
 *      JPA 分页排序查询 提交方式 GET -> : http://localhost:8085/userRightsRechargeRecords?page=0&size=20&sort=id,desc
 *
 *                  返回结果：
 *                          {
 *                               "_embedded" : {
 *                                   "userRightsRechargeRecords" : [
 *                                      {
 *                                           "userId" : 123,
 *                                           "relationId" : null,
 *                                           "type" : null,
 *                                           "alterCount" : null,
 *                                           "giftCount" : null,
 *                                           "currentCount" : null,
 *                                           "item" : null,
 *                                           "description" : "GG",
 *                                           "status" : null,
 *                                           "createTime" : null,
 *                                           "updateTime" : null,
 *                                           "_links" : {
 *                                               "self" : {
 *                                                   "href" : "http://localhost:8085/userRightsRechargeRecords/811"
 *                                                   },
 *                                               "userRightsRechargeRecord" : {
 *                                                   "href" : "http://localhost:8085/userRightsRechargeRecords/811"
 *                                                   }
 *                                           }
 *                                       },
 *                                      {
 *                                       "userId" : 11,
 *                                       "relationId" : null,
 *                                       "type" : 1,
 *                                       "alterCount" : null,
 *                                       "giftCount" : 0,
 *                                       "currentCount" : 0,
 *                                       "item" : 0,
 *                                       "description" : "德玛西亚",
 *                                       "status" : null,
 *                                       "createTime" : "2017-08-30T03:27:30.000+0000",
 *                                       "updateTime" : "2017-08-30T03:27:30.000+0000",
 *                                       "_links" : {
 *                                           "self" : {
 *                                               "href" : "http://localhost:8085/userRightsRechargeRecords/809"
 *                                               },
 *                                           "userRightsRechargeRecord" : {
 *                                               "href" : "http://localhost:8085/userRightsRechargeRecords/809"
 *                                               }
 *                                           }
 *                                       }
 *                                      ]
 *                                   },
 *                                   "_links" : {
 *                                       "first" : {
 *                                           "href" : "http://localhost:8085/userRightsRechargeRecords?page=0&size=20&sort=id,desc"
 *                                           },
 *                                       "self" : {
 *                                           "href" : "http://localhost:8085/userRightsRechargeRecords"
 *                                           },
 *                                       "next" : {
 *                                           "href" : "http://localhost:8085/userRightsRechargeRecords?page=1&size=20&sort=id,desc"
 *                                           },
 *                                       "last" : {
 *                                           "href" : "http://localhost:8085/userRightsRechargeRecords?page=1&size=20&sort=id,desc"
 *                                           },
 *                                       "profile" : {
 *                                           "href" : "http://localhost:8085/profile/userRightsRechargeRecords"
 *                                           }
 *                                   },
 *                                   "page" : {
 *                                       "size" : 20,
 *                                       "totalElements" : 24,
 *                                       "totalPages" : 2,
 *                                       "number" : 0
 *                                   }
 *                               }
 *
 *
 * </pre>
 * * Created by pengwei
 * 2017/8/29.
 */
//public interface UserRightsRechargeRecordRepository extends CrudRepository<UserRightsRechargeRecord,Integer>{
//public interface UserRightsRechargeRecordRepository extends PagingAndSortingRepository<UserRightsRechargeRecord,Integer> {
public interface UserRightsRechargeRecordRepository extends JpaRepository<UserRightsRechargeRecord, Integer> {
}
