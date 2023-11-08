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
@Table(name = "school_branches")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long branchId;
	private School belongingSchool;
	private String branchAddress;
	private List<String> branchEmails;
	private List<Long> branchContacts;
	private Long branchCode;
	private Long branchRegistrationNumber;
	private boolean isPrimaryBranch;
	private String createdBy;
	private String lastModifiedBy;
	private Date creationDate;
	private Date lastModificationDate;
	private boolean isBranchActive;
	
}
