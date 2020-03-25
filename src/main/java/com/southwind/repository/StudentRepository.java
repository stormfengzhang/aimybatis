package com.southwind.repository;

import com.southwind.entity.Student;
//通过学生查班级，结果Student(id=1, name=张三, classes=Classes(id=1, name=6班, students=null))
public interface StudentRepository {

    public Student findById(long id);
    public Student findByIdLazy(long id);
}
