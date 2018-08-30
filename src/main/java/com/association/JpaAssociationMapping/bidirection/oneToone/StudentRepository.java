package com.association.JpaAssociationMapping.bidirection.oneToone;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("studentRepo")
public interface StudentRepository extends JpaRepository<Student, Long> {

	Optional<Student> findById(Long id);

}
