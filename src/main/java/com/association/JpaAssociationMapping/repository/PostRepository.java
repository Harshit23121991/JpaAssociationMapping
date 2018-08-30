package com.association.JpaAssociationMapping.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.association.JpaAssociationMapping.unidirection.oneToMany.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

	Optional<Post> findById(Long id);

}
