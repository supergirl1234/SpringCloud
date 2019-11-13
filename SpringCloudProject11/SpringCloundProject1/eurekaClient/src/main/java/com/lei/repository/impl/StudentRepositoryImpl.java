package com.lei.repository.impl;

import com.lei.entity.Student;
import com.lei.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private  static Map<Integer,Student> hashMap;
    static {

        hashMap=new HashMap<>();
        hashMap.put(1,new Student(1,"张三",12));
        hashMap.put(2,new Student(2,"李四",13));
        hashMap.put(3,new Student(3,"Lucy",14));
        hashMap.put(4,new Student(4,"Lucky",15));
    }
    @Override
    public Collection<Student> findAll() {
        return hashMap.values();
    }

    @Override
    public Student findById(int id) {
        return hashMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
       hashMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(int id) {
        hashMap.remove(id);

    }
}
