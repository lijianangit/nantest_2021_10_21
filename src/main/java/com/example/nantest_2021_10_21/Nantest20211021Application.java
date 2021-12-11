package com.example.nantest_2021_10_21;

import com.example.nantest_2021_10_21.domain.BusinessLibrary;
import com.example.nantest_2021_10_21.service.BusinessLibraryController;
import com.mongodb.client.result.UpdateResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

@SpringBootApplication
public class Nantest20211021Application {

    public static void main(String[] args) {
        SpringApplication.run(Nantest20211021Application.class, args);
        Nantest20211021Application app = new Nantest20211021Application();
        app.testMongoOperator();
    }

    private void testMongoOperator() {
        BusinessLibraryController controller = new BusinessLibraryController();
        try {
            controller.testMongoOperator("sdfasdf", "asdfasdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
