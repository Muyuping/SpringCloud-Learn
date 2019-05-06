package com.springcloud.mapper;

import com.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    @Insert("insert into dep(dname,db_source) values(#{dname},#{db_source})")
    @Options(useGeneratedKeys = true,keyProperty = "deptno")
    boolean insertDep(Dept dep);
    @Select("select * from dep where deptno=#{id}")
    Dept selectById(Integer id);
    @Select("select * from dep")
    List<Dept> selectAll();
}
