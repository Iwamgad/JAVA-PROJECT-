package com.portfolio.SpringBoot.Project.repository;

import com.portfolio.SpringBoot.Project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {


}
