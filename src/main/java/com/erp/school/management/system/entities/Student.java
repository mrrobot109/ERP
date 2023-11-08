package com.erp.school.management.system.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	private Branch branch;
	private Long studentAdmissionNumber;
	private String studentName;
	private Integer studentAge;
	private String studentGender;
	private Date studentDateOfBirth;
	private Long studentAadharNumber;
	private Class belongingClass;
	private List<Subject> studentSubjects;
	private List<String> studentEmailAddresses;
	
	private String fatherName;
	private Integer fatherAge;
	private Date fatherDateOfBirth;
	private List<String> fatherContacts;
	private List<String> fatherEmailAddresses;
	private Long fathersAadharNumber;
	
	private String motherName;
	private Integer motherAge;
	private Date motherDateOfBirth;
	private List<String> motherContacts;
	private List<String> motherEmailAddresses;
	private Long mothersAadharNumber;
	
	private String guardianName;
	private String guardianRelationWithStudent;
	private Integer guardianAge;
	private Date guardianDateOfBirth;
	private List<String> guardianContacts;
	private List<String> guardianEmailAddresses;
	private Long guardiansAadharNumber;
	
	private boolean isEnrolled;
	private List<String> studentAddresses;
	private String primaryAddress;
	
	private String enteredBy;
	private String lastModifiedBy;
	private Date creationDate;
	private Date lastModificationDate;
}
