package com.southwind.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * 调用MyBatis的原生接口执行添加操作-----需要实现类吗？？？？？Test目前可以执行成功
 */

public class Test {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        String statement = "com.southwind.mapper.AccountMapper.save";
//        Account account = new Account(1L,"张三","123123",22);
//        sqlSession.insert(statement,account);
        String statement = "com.southwind.mapper.AccountMapper.deleteById";
        sqlSession.delete(statement,1L);
        //注意要提交事务，不然不生效。对于查询操作不用提交事务
        sqlSession.commit();
        //操作完之后要将资源关闭，不然会造成资源浪费
        sqlSession.close();

    }
}
