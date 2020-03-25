package com.southwind.test;

import com.southwind.entity.Account;
import com.southwind.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;


//调用接口的代理对象完成相关的业务操作
public class Test2 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取实现接口的代理对象
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);

        /* //添加对象
        Account account = new Account(8L,"王1五","3434",23);
        int result = accountRepository.save(account);
        sqlSession.commit();

        //查询全部对象
        List<Account> list = accountRepository.findAll();
        for (Account account : list){
            System.out.println(account);
        }

        //按id进行查询
        Account account1 = accountRepository.findById(2);
        System.out.println(account1);
        sqlSession.close();

        //按name来查询
        System.out.println(accountRepository.findByName("张三"));
        sqlSession.close();

         //按包装类来查询(基本数据类型有缺点，写业务代码时不能接收null值，用包装类就比较好了)
        Long id = Long.parseLong("1");
        System.out.println(accountRepository.findById2(id));
        sqlSession.close();

        //多个参数，通过 name 和 age 查询 Account
        System.out.println(accountRepository.findByNameAndAge("张三",23));
        sqlSession.close();

          //基本数据类型，统计 Account 总数
        System.out.println(accountRepository.count());
        sqlSession.close();

        //修改对象
        Account account = accountRepository.findById(5L);
        account.setUsername("小明");
        account.setPassword("9403");
        account.setAge(19);
        int result = accountRepository.update(account);
        sqlSession.commit();
        System.out.println(result);
        sqlSession.close();


        //删除对象
        int result = accountRepository.deleteById(4L);
        System.out.println(result);
        sqlSession.commit();
        sqlSession.close();

        //基本数据类型，统计 Account 总数
        System.out.println(accountRepository.count());
        //包装类，统计 Account 总数
        System.out.println(accountRepository.count2());
        */

        System.out.println(accountRepository.findNameById(1L));
        sqlSession.close();


    }


}
