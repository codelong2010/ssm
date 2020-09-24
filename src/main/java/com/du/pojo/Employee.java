package com.du.pojo;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;

/**
 * @author xiaolong
 * @create 2020-09-23 15:11
 * @description
 */
public class Employee {

    //员工id
    @Min(0)
    private int id;

    //员工名字
    @NotBlank
    private String name;

    //员工年龄
    @Range(min = 20,max = 60)
    private int age;

    //员工性别
    @NotBlank
    private String sex;

    //员工地址
    @NotBlank
    private String address;

    //员工电话
    @Min(0)
    private long phone;

    //员工密码
    @NotBlank
    private String password;

    public Employee() {
    }

    public Employee(String name, int age, String sex, String address, long phone, String password) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", password='" + password + '\'' +
                '}';
    }
}
