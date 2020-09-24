package com.du.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.du.Exception.CustomException;
import com.du.Exception.CustomExceptionResolver;
import com.du.pojo.Employee;
import com.du.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author xiaolong
 * @create 2020-09-23 16:29
 * @description
 */
@Controller
@RequestMapping(value = "/employee", produces = "text/html;charset=UTF-8", consumes = "application/json")
public class EmployeeController {
    @Autowired
    @Qualifier("EmployeeServiceImpl")
    private EmployeeService employeeService;

    //查询某个员工
    @GetMapping("/{id}")
    @ResponseBody
    public Object queryone(@PathVariable("id") int id) throws CustomException {
        if(id < 0) throw new CustomException("id不能为负数");
        Employee employee = employeeService.queryEmployeeById(id);
        return employee.toString();
    }

    //查询所有员工
    @GetMapping
    @ResponseBody
    public Object queryall(){
        List<Employee> employees = employeeService.queryAllEmployee();
        return employees.toString();
    }

    //删除某个员工
    @DeleteMapping("/{id}")
    @ResponseBody
    public Object delone(@PathVariable("id") int id) throws CustomException {
        if(id < 0) throw new CustomException("id不能为负数");
        int num = employeeService.deleteEmployeeById(id);
        if(num > 0) return "删除成功";
        else return "删除失败";
    }

    //更新某个员工
    @PutMapping
    @ResponseBody
    public Object updateone(@RequestBody @Valid Employee employee){
        int num = employeeService.updateEmployee(employee);
        if(num > 0) return "更新成功";
        else return "更新失败";
    }

    //新增某个员工
    @PostMapping
    @ResponseBody
    public Object addone(@RequestBody @Valid Employee employee){
        int num = employeeService.addEmployee(employee);
        if(num > 0) return "添加成功";
        else return "添加失败";
    }

}
