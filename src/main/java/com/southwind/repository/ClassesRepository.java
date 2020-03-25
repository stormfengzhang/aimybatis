package com.southwind.repository;

import com.southwind.entity.Classes;
//通过班级查学生，运行结果Classes(id=2, name=3班, students=[Student(id=2, name=李四, classes=null)])
public interface ClassesRepository {

    public Classes findById(long id);
    public Classes findByIdLazy(long id);

}
