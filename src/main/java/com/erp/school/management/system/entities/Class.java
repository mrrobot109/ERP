package com.erp.school.management.system.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "classes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Class {

	private Long classId;
	private Branch branch;
	private List<Section> sectionsList;
	private Integer standard;
	private Integer numberOfStudentsInTheClass;
//	private List<Student> studentsInTheClass;
	private List<Subject> listOfSubjectsInTheClass;
}
