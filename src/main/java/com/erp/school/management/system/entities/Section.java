package com.erp.school.management.system.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sections")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Section {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sectionId;
	private Class belongingClass;
	private Branch branch;
	private String sectionDescription;
}
