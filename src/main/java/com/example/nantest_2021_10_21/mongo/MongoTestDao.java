/*
package com.example.nantest_2021_10_21.mongo;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTestCmplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class MongoTestDao {


    @Autowired
    private MongoTemplate mongoTemplate;

    */
/**
     * 创建对象
     *//*

    public void saveTest(MongoTest test) {
        mongoTemplate.save(test);
    }

    */
/**
     * 根据用户名查询对象
     *
     * @return
     *//*

    public MongoTest findTestByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        MongoTest mgt = mongoTemplate.findOne(query, MongoTest.class);
        return mgt;
    }

    */
/**
     * 更新对象
     *//*

    public UpdateResult updateTest(MongoTest test) {
        Query query = new Query(Criteria.where("id").is(test.getId()));
        Update update = new Update().set("age", test.getAge()).set("name", test.getName());
        //更新查询返回结果集的第一条
        UpdateResult res = mongoTemplate.updateFirst(query, update, MongoTest.class);
        return res;
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,TestEntity.class);
    }

    */
/**
     * 删除对象
     *
     * @param id
     *//*

    public DeleteResult deleteTestById(Integer id) {
        Query query = new Query(Criteria.where("id").is(id));
        DeleteResult res = mongoTemplate.remove(query, MongoTest.class);
        return res;
    }
}
*/
