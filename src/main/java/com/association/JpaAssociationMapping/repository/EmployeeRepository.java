package com.association.JpaAssociationMapping.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.association.JpaAssociationMapping.bidirection.oneToMany.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Optional<Employee> findByEmpId(Long id);

}
