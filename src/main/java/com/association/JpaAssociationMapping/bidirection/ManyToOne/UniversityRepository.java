package com.association.JpaAssociationMapping.bidirection.ManyToOne;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("universityRepoManyToOneBidirection")
public interface UniversityRepository extends JpaRepository<University, Long> {

	Optional<University> findById(Long id);

}
