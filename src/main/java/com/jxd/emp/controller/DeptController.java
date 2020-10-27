package com.jxd.emp.controller;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxd.emp.model.Dept;
import com.jxd.emp.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Wrapper;
import java.util.List;

/**
 * @ClassName DeptController
 * @Description TODO
 * @Author Deng ShenYi
 * @Date 2020/10/23
 * @Version 1.0
 */
@Controller
public class DeptController {
   /* @Autowired
    private IDeptMapper deptMapper;*/

    @Autowired
    private IDeptService deptService;

    @RequestMapping("/getDept")
    @ResponseBody
    public List<Dept> getDept(){
      /*  //创建条件构造器对象
        Wrapper<Dept> wrapper = new QueryWrapper<>();*/
        /*Wrapper<Dept> wrapper = new  AbstractWrapper<>();*/
        return deptService.list();
    }

}
