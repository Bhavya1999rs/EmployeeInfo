package com.cg.Dao;

import java.util.List;

import com.cg.Entity.Department;

public interface DepartmentDao {

 

	String addDepartment(Department d);

 

	List<Department> getAllDepartment();

 

}
