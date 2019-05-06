package com.muyuping.springcloud.controller;

import com.springcloud.Service.DeptClientService;
import com.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {
    @Autowired
    private DeptClientService deptClientService;
    @RequestMapping("/put")
    public boolean insert(Dept dept){

        return deptClientService.add(dept);
    }
    @RequestMapping("/{id}")
    public Dept getone(@PathVariable Integer id){
         return deptClientService.get(id);
    }
    @GetMapping("/all")
    public List getall(){
        System.out.println("哈哈哈，我的feign配置成功了!");
       return deptClientService.list();
    }
}
