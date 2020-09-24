package com.du.service;

import com.du.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiaolong
 * @create 2020-09-23 15:47
 * @description
 */
public interface EmployeeService {
    int addEmployee(Employee employee);

    int deleteEmployeeById(int id);

    int updateEmployee(Employee employee);

    Employee queryEmployeeById(int id);

    List<Employee> queryAllEmployee();

}
