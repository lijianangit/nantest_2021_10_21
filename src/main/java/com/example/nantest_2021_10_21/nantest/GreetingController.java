package com.example.nantest_2021_10_21.nantest;

import java.text.MessageFormat;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@RestController
/**
 * RestController==controller +ResponseBody
 */
public class GreetingController {

    private static final String template = "Hello2222222222222222, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public ModelAndView greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("sadfasf213213d");
        Greet greet = new Greet(counter.incrementAndGet(), String.format(template, name));
        System.out.print(JSON.toJSONString(greet));
        return new ModelAndView(greet.toString());

    }

/*    @RestController
    @RequestMapping(value = "api/currencies", produces = MediaType.APPLICATION_JSON_VALUE)
    public class CurrencyController extends AbstractJsonRestController<Currency, Long, CurrencyManager> {
        @Autowired
        public CurrencyController(CurrencyManager manager) {
            super(manager);
        }

    }*/

/*
    @GetMapping("/saveTest")
    public void saveTest() throws Exception {
        TestMongo a = new TestMongo();
        a.saveTest();
        System.out.println('a');
    }*/
}