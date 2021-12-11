package com.example.nantest_2021_10_21.service;

import com.example.nantest_2021_10_21.domain.BusinessLibrary;
import com.mongodb.client.result.UpdateResult;
import com.sun.istack.internal.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class BusinessLibraryController {
    @Autowired
    public MongoTemplate mongoTemplate;
    private Logger log;

    public void testMongoOperator(String... args) throws Exception {
        System.out.println("begin");
        System.out.println(args);
        //创建对象
        BusinessLibrary domain = BusinessLibrary.builder()
                .description("nantest")
                .type("nantest")
                .name("name")
                .build();
        //新建
        BusinessLibrary saved = mongoTemplate.save(domain);
        //查询
        List<BusinessLibrary> list = mongoTemplate.find(
                Query.query(Criteria.where("description").is("nantest")), BusinessLibrary.class);
        //更新
        UpdateResult result = mongoTemplate.updateFirst(Query.query(Criteria.where("description").is("nantest")),
                new Update().set("type", "233333").currentDate("33333332"), BusinessLibrary.class);
        //查询单条
        BusinessLibrary updateOne = mongoTemplate.findById(saved.get_id(), BusinessLibrary.class);
        //删除
        /* mongoTemplate.remove(updateOne);*/
        System.out.println("after");
    }
}
