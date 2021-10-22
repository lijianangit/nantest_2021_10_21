package com.example.nantest_2021_10_21.nantest;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Greet {

    private long id;
    private String content;

    public Greet(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
