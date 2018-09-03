package com.association.JpaAssociationMapping.bidirection.ManyToOne;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("studentRepoManyToOneBidirection")
public interface StudentRepository extends JpaRepository<Student, Long> {

	Optional<Student> findById(Long id);

}
