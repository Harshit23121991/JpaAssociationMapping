package com.association.JpaAssociationMapping.unidirection.oneToone;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.association.JpaAssociationMapping.repository.AddressRepository;
import com.association.JpaAssociationMapping.repository.StudentRepository;

@CrossOrigin
@RestController
@RequestMapping("/rest/unidirection/onetoone")
public class OneToOneUniDirectionMappingResource {
	@Autowired
	private StudentRepository studentRepository; 
	
	@Autowired
	private AddressRepository addressRepository; 
	
	@GetMapping("/{id}")
	public Optional<Student> getStudent(@PathVariable("id") final Long id){
		return studentRepository.findById(id);
	}

	@PostMapping("/add")
	public Student addStudent(@RequestBody final Student postForm ){
		return studentRepository.save(postForm);
	}
	
	@GetMapping("/address/{id}")
	public Optional<Address> getAddress(@PathVariable("id") final Long id){
		return addressRepository.findById(id);
	}
}
