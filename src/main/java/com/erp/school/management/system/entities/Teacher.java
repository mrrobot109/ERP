package com.erp.school.management.system.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "teachers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

	private Long teacherId;
	private Staff staff;
	private List<Branch> branchesWhichTeacherWorks;
	private String teacherName;
	private Date teacherDateOfBirth;
	private Integer teachersAge;
	private Date dateOfJoining;
	private List<String> teacherContact;
	private List<String> teacherEmailAddress;
	private Long teachersAadharNumber;
	private String teachersGender;
	private String marritalStatus;
	// PAN
	private String permanentAccountNumber;
	private List<String> teachersAddresses;
	private String permanentAddress;
	private List<Subject> subjectsTeacherTeaches;
	private List<String> teachersQualification;
	private Integer totalExperience;
	private String previousSchoolName;
	private List<String> languagesKnownByTeacher;
	private String designation;
	
	private String createdBy;
	private String lastModifiedBy;
	private Date creationDate;
	private Date modificationDate;
	
}
