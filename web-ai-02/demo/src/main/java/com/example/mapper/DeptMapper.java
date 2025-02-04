package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.pojo.Dept;

@Mapper
public interface DeptMapper {

    @Select("SELECT id, name, create_time, update_time FROM dept ORDER BY update_time DESC")
    List<Dept> findAll();

}
