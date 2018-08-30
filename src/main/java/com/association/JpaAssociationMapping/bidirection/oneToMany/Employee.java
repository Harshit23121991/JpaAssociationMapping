package com.association.JpaAssociationMapping.bidirection.oneToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private Long empId;
	private String name;
	private String surname;
	private String title;
	private Date created;
	//@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Department> department = new ArrayList<>();

	public Long getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getTitle() {
		return title;
	}

	public Date getCreated() {
		return created;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public void addComment(Department comment) {
		department.add(comment);
		comment.setEmployee(this);
	}

	public void removeComment(Department comment) {
		department.remove(comment);
		comment.setEmployee(this);
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + empId + ", name=" + name + ", surname=" + surname + ", title=" + title + ", created="
				+ created + ", department=" + department + "]";
	}
}
