package com.association.JpaAssociationMapping.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.association.JpaAssociationMapping.bidirection.oneToMany.Department;
import com.association.JpaAssociationMapping.bidirection.oneToMany.Employee;
import com.association.JpaAssociationMapping.unidirection.oneToone.Address;
import com.association.JpaAssociationMapping.unidirection.oneToone.Student;

public interface AddressRepository extends JpaRepository<Address, Long> {

	Optional<Address> findById(Long id);

}
