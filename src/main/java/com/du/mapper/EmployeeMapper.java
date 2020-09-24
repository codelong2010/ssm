package com.du.mapper;

import com.du.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiaolong
 * @create 2020-09-23 15:19
 * @description
 */
@Mapper
public interface EmployeeMapper {

    //添加一个员工
    int addEmployee(Employee employee);

    //删除一个员工
    int deleteEmployeeById(@Param("id") int id);

    //更新一个员工
    int updateEmployee(Employee employee);

    //查询一个员工
    Employee queryEmployeeById(@Param("id") int id);

    //查询全部员工
    List<Employee> queryAllEmployee();
}
