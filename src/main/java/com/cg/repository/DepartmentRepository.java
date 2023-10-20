package com.cg.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Entity.Department;


@org.springframework.stereotype.Repository

public interface DepartmentRepository extends JpaRepository<Department, String> {
}
