package com.association.JpaAssociationMapping.unidirection.ManyToOne;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("studentRepoManyToOne")
public interface StudentRepository extends JpaRepository<Student, Long> {

	Optional<Student> findById(Long id);

}
