package com.cg.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cg.Dao.DepartmentDao;
import com.cg.Entity.Department;
import com.cg.repository.DepartmentRepository;

@Service

public class DepartmentService implements DepartmentDao {

	@Autowired

	DepartmentRepository dr;


	@Override

	public String addDepartment(Department d) {

		dr.save(d);

		return "Department added.....";

	}

	@Override

	public List<Department> getAllDepartment() {

		

		return dr.findAll();

	}
}

