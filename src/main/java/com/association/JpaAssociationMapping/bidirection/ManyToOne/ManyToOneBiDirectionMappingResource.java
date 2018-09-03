package com.association.JpaAssociationMapping.bidirection.ManyToOne;

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
@RequestMapping("/rest/bidirection/manytoone")
public class ManyToOneBiDirectionMappingResource {
	@Autowired
	@Qualifier("studentRepoManyToOneBidirection")
	private StudentRepository studentRepository; 
	
	@Autowired
	@Qualifier("universityRepoManyToOneBidirection")
	private UniversityRepository universityRepository;
	
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
	
	@GetMapping("/university/{id}")
	public Optional<University> getUniversity(@PathVariable("id") final Long id){
		return universityRepository.findById(id);
	}

	@PostMapping("/university/add")
	public University addUniversity(@RequestBody final University university ){
		return universityRepository.save(university);
	}
}
