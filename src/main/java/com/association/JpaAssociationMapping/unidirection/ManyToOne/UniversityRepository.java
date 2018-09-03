package com.association.JpaAssociationMapping.unidirection.ManyToOne;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.association.JpaAssociationMapping.bidirection.oneToMany.Department;
import com.association.JpaAssociationMapping.bidirection.oneToMany.Employee;
import com.association.JpaAssociationMapping.unidirection.oneToone.Student;

public interface UniversityRepository extends JpaRepository<University, Long> {

	Optional<University> findById(Long id);

}
