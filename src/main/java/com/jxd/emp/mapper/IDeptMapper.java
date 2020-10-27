package com.jxd.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.emp.model.Dept;

import java.util.Map;

public interface IDeptMapper extends BaseMapper<Dept> {
    Map<String,Object> map();

}
