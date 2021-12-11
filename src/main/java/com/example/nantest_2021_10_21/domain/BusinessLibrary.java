package com.example.nantest_2021_10_21.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusinessLibrary {
    @Id
    private String _id;
    /**
     * 类型：IPCResource子类的clazz
     * 同一个库中只能放相同的type的资源
     */
    private String type;

    /**
     * 描述
     */
    private String description;

    /**
     * 名称
     */
    private String name;
}
