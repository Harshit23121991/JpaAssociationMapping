package com.association.JpaAssociationMapping.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.association.JpaAssociationMapping.bidirection.oneToMany.Department;
import com.association.JpaAssociationMapping.bidirection.oneToMany.Employee;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	Optional<Employee> findByDeptId(Integer id);

}
