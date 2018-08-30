package com.association.JpaAssociationMapping.bidirection.oneToone;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/rest/bidirection/onetoone")
public class OneToOneBiDirectionMappingResource {
	@Autowired
	@Qualifier("studentRepo")
	private StudentRepository studRepository; 
	
	@Autowired
	@Qualifier("addressRepo")
	private AddressRepository addRepository; 
	
	@GetMapping("/{id}")
	public Optional<Student> getStudent(@PathVariable("id") final Long id){
		return studRepository.findById(id);
	}

	@PostMapping("/add")
	public Student addStudent(@RequestBody final Student postForm ){
		return studRepository.save(postForm);
	}
	
	@GetMapping("/address/{id}")
	public Optional<Address> getAddress(@PathVariable("id") final Long id){
		return addRepository.findById(id);
	}
}
