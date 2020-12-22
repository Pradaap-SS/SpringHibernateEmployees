package com.cognizant.springhibernate.employee.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "job_history")
public class JobHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	@Column(name = "job_history_id")
	private int jobHistoryId;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	public Employees employees;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "end_date")
	private LocalDate endDate;

	@OneToMany
	@JoinColumn(name = "department_id")
	public List<Departments> departments;

	public int getJobHistoryId() {
		return jobHistoryId;
	}

	public void setJobHistoryId(int jobHistoryId) {
		this.jobHistoryId = jobHistoryId;
	}

	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public List<Departments> getDetartments() {
		return departments;
	}

	public void setDetartments(List<Departments> departments) {
		this.departments = departments;
	}
	
	

}
