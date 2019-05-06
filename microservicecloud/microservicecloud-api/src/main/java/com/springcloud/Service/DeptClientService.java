package com.springcloud.Service;

import java.util.List;
import com.springcloud.pojo.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 */
@FeignClient(value = "MUYUPINGMICROSERVICE",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService
{
	@GetMapping (value = "/dept/{id}")
	public Dept get(@PathVariable("id") Integer id);

	@GetMapping(value = "/dept/all")
	public List<Dept> list();

	@RequestMapping(value = "/dept/put", method = RequestMethod.POST)
	public boolean add(Dept dept);
}
