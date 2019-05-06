package com.muyuping.springcloud.controller;

import com.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer/dept")
public class DeptController_Consumer {
    @Autowired
    private RestTemplate restTemplate;
    private static String  provider_URL = "http://MUYUPINGMICROSERVICE";

    @RequestMapping("/add")
    public boolean insert(Dept dept){

        return restTemplate.postForObject(provider_URL+"/dept/put", dept, Boolean.class);
    }
    @RequestMapping("{id}")
    public Dept getone(@PathVariable Integer id){
         Dept dept = restTemplate.getForObject(provider_URL+"/dept/"+id,Dept.class);
         return dept;
    }
    @GetMapping("/all")
    public List getall(){
        List<Dept> list = restTemplate.getForObject(provider_URL+"/dept/all",List.class);
        return list;
    }
}
