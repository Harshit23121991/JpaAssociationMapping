package com.association.JpaAssociationMapping.unidirection.ManyToOne;

import java.util.List;
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
@RequestMapping("/rest/unidirection/manytoone")
public class ManyToOneUniDirectionMappingResource {
	@Autowired
	@Qualifier("studentRepoManyToOne")
	private StudentRepository studentRepository; 
	
	@GetMapping("/{id}")
	public Optional<Student> getStudent(@PathVariable("id") final Long id){
		return studentRepository.findById(id);
	}

	@PostMapping("/add")
	public Student addStudent(@RequestBody final Student student ){
		return studentRepository.save(student);
	}
	
	@PostMapping("/addMultipleStudent")
	public List<Student> addMultipleStudent(@RequestBody final List<Student> student ){
		return studentRepository.saveAll(student);
	}
}
