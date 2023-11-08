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
@Table(name = "schools")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long schoolId;
		private String schoolName;
		private List<String> schoolWebsites;
		private Long schoolRegistrationNumber;
		private Date schoolEstablishDate;
		private Long primaryBranchId;
		
		private String createdBy;
		private String lastModifiedBy;
		private Date creationDate;
		private Date lastModificationDate;
		private List<Branch> schoolBranches;
		private List<Owner> schoolOwners;
		private boolean isSchoolActive;
}
