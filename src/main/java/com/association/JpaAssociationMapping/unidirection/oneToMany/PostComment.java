package com.association.JpaAssociationMapping.unidirection.oneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "PostComment")
@Table(name = "post_comment")
public class PostComment {
	
	@Id
    @GeneratedValue
    private Long id;
 
    private String review;

	public Long getId() {
		return id;
	}

	public String getReview() {
		return review;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setReview(String review) {
		this.review = review;
	}

}
