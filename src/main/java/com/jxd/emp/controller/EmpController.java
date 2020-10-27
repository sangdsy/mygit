package com.jxd.emp.controller;


import com.jxd.emp.model.Dept;
import com.jxd.emp.model.Emp;
import com.jxd.emp.service.IDeptService;
import com.jxd.emp.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName EmpController
 * @Description TODO
 * @Author Deng ShenYi
 * @Date 2020/10/22
 * @Version 1.0
 */
@Controller
public class EmpController {
    @Autowired
    private IEmpService empService;
    @Autowired
    private IDeptService deptService;

    @Value("${name}")
    private String name;

    @Value("${student.sname}")
    private String sname;

    @Value("${persons[0].pname}")
    private String pname;


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(name);
        System.out.println(sname);
        System.out.println(pname);
        return "hello springBoot!!!热部署测试";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello springBoot!!!热部署测试";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Emp> getAll(){
        return empService.getAll();
    }

    @RequestMapping("/helloBtl")
    public String helloBtl(Model model){
        model.addAttribute("msg","hello");
        return "hello.btl";
    }

    @RequestMapping("/helloBtl02")
    public String helloBtl02(Model model){
        model.addAttribute("msg","html模板文件");
        return "hello02.html";
    }

    @RequestMapping("/welcome")
    public String welcome(Model model){
        List<Dept> list = deptService.list();
        model.addAttribute("list",list);
        model.addAttribute("msg","改变了模板位置");
        return "welcome.html";
    }

    @RequestMapping("/login/{uname}/{pwd}")
    @ResponseBody
    public String login(@PathVariable("uname") String uname, @PathVariable("pwd")String pwd){
        if ("admin".equals(uname) && "123".equals(pwd)){
            return "success";
        }else {
            return "error";
        }
    }

}
