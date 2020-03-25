package com.southwind.test;


import com.southwind.entity.Classes;
import com.southwind.entity.Student;
import com.southwind.repository.ClassesRepository;
import com.southwind.repository.CustomerRepository;
import com.southwind.repository.GoodsRepository;
import com.southwind.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
//        System.out.println(studentRepository.findById(1L));
//
//        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findById(1L));
//        CustomerRepository customerRepository = sqlSession.getMapper(CustomerRepository.class);
//        System.out.println(customerRepository.findById(1L));
//        GoodsRepository goodsRepository = sqlSession.getMapper(GoodsRepository.class);
//        System.out.println(goodsRepository.findById(1L));
        //单表查询(如果通过学生查询班级信息的话就必须查两次,在config.xml中开启延迟加载可以自动判断执行几次SQL)
        StudentRepository studentRepository = sqlSession.getMapper(StudentRepository.class);
        Student student =  studentRepository.findByIdLazy(1L);

//        System.out.println(student.getName());
        System.out.println(student.getClasses());
//        System.out.println(student);
//        ClassesRepository classesRepository = sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findByIdLazy(1L));
        sqlSession.close();
    }
}
