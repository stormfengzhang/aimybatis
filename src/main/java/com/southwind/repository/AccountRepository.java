package com.southwind.repository;

import com.southwind.entity.Account;

import java.util.List;

/**
 * 通过Mapper代理实现自定义接口(比原生接口常用)--（实现类和对象不用写，Mapper会自动生成它的实现类）
 * （1）自定义接口，定义相关业务方法
 * （2）编写与方法相对应的Mapper.xml
 */

//自定义接口
public interface AccountRepository {
    public int save(Account account);
    public int update(Account account);
    public int deleteById(long id);
    public List<Account> findAll();
    public Account findById(long id);
    public Account findById2(Long id);         //包装类
    public Account findByName(String name);
    public Account findByNameAndAge(String name,int age);
    public int count();
    public Integer count2();
    public String findNameById(long id);
    public Account findByAccount(Account account);
    public List<Account> findByIds(Account account);

}
