package com.southwind.entity;

//外键不用在实体类中体现
import lombok.Data;

@Data
public class Student {
    private long id;
    private String name;
    private Classes classes;
}
