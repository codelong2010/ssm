package com.du.service;

import com.du.mapper.EmployeeMapper;
import com.du.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiaolong
 * @create 2020-09-23 15:48
 * @description
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    public int deleteEmployeeById(int id) {
        return employeeMapper.deleteEmployeeById(id);
    }

    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    public Employee queryEmployeeById(int id) {
        return employeeMapper.queryEmployeeById(id);
    }

    public List<Employee> queryAllEmployee() {
        return employeeMapper.queryAllEmployee();
    }

}
