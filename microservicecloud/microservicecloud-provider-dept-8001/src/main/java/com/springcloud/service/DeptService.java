package com.springcloud.service;

import com.springcloud.mapper.DepartmentMapper;
import com.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptService {
    @Autowired
    DepartmentMapper departmentMapper;

    public Dept findById(Integer id){
        Dept dept = departmentMapper.selectById(id);
        return dept;
    }
    public List findAll(){
        return departmentMapper.selectAll();
    }
    public boolean insert(Dept dept){
        return departmentMapper.insertDep(dept);
    }
}
