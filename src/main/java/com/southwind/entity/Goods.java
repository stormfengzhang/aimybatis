package com.southwind.entity;
//物品和消费者之间是一对多的关系
import lombok.Data;

import java.util.List;

@Data
public class Goods {
    private long id;
    private String name;
    private List<Customer> customers;
}
