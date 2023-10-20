package com.cg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cg.Entity.Department;
import com.cg.Service.DepartmentService;

@RestController

@RequestMapping("/departmentapi")

public class DepartmentController {

	@Autowired

	private DepartmentService dservice;

	@PostMapping("/")

	public String add(@RequestBody Department department) {

		return dservice.addDepartment(department);

	}

	@GetMapping("/")

	public List<Department> getAll(@RequestBody Department department) {

		return dservice.getAllDepartment();
	}
}
