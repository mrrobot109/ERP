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
@Table(name = "owners")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ownerId;
	private String ownerName;
	private List<Long> ownerContacts;
	private List<String> ownerAddresses;
	private List<String> ownerEmailAddresses;
	private List<School> schoolsThatOwnerOwns;
	private Date enteredDate;
	private Date lastModifiedDate;
	private String enteredBy;
	private String lastModifiedBy;
	
}
