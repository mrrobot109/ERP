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
@Table(name = "working_staff")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkingStaff {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long wStaffId;
	private Staff staff;
	private String staffName;
	private Date staffDateOfBirth;
	private String staffGender;
	private Integer staffAge;
	private List<String> staffContacts;
	private List<String> staffEmailAddresses;
	private Long staffAadharNumber;
	private String staffPAN;
	private List<String> staffAddresses;
	private String staffPermanentAddress;
	private String staffMarittalStatus;
	private String staffDesignation;
	private Integer staffTotalExperience;
	
	private String createdBy;
	private String lastModifiedBy;
	private Date creationDate;
	private Date lastModificationDate;
	
}
