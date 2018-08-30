package com.association.JpaAssociationMapping.bidirection.oneToMany;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.association.JpaAssociationMapping.repository.DepartmentRepository;
import com.association.JpaAssociationMapping.repository.EmployeeRepository;

@CrossOrigin
@RestController
@RequestMapping("/rest/bidirection/onetomany")
public class OneToManyBiDirectionMappingResource {
	@Autowired
	private EmployeeRepository employeeRepository; 
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@GetMapping("/{id}")
	public Optional<Employee> getEmployee(@PathVariable("id") final Long id){
		return employeeRepository.findById(id);
	}

	@PostMapping("/add")
	public Employee addEmployee(@RequestBody final Employee emp ){
		return employeeRepository.save(emp);
	}
	
	@GetMapping("/department/{id}")
	public Optional<Department> getDepartment(@PathVariable("id") final Integer id){
		return departmentRepository.findById(id);
	}
}
