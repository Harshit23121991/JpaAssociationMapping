package com.association.JpaAssociationMapping.bidirection.oneToone;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("addressRepo")
public interface AddressRepository extends JpaRepository<Address, Long> {

	Optional<Address> findById(Long id);

}
