package com.ssm.test.dao;

import com.ssm.test.pojo.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(String employeeid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String employeeid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}