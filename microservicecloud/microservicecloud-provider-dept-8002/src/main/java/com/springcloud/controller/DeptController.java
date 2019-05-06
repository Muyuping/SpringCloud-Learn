package com.springcloud.controller;

import com.springcloud.pojo.Dept;
import com.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptService deptService;
    @GetMapping("/{id}")
    public Dept get(@PathVariable Integer id){
            return deptService.findById(id);
    }
    @GetMapping("/all")
    public List<Dept> getall(){
        return deptService.findAll();
    }
    @PostMapping("/put")
    public boolean insert(@RequestBody  Dept dept){
        return deptService.insert(dept);
    }
}
