package com.cognizant.springhibernate.employee.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springhibernate.employee.model.Countries;
import com.cognizant.springhibernate.employee.model.Departments;
import com.cognizant.springhibernate.employee.model.Employees;
import com.cognizant.springhibernate.employee.model.JobHistory;
import com.cognizant.springhibernate.employee.model.Jobs;
import com.cognizant.springhibernate.employee.model.Locations;
import com.cognizant.springhibernate.employee.model.Regions;
import com.cognizant.springhibernate.employee.repo.CountriesRepo;
import com.cognizant.springhibernate.employee.repo.DepartmentsRepo;
import com.cognizant.springhibernate.employee.repo.EmployeesRepo;
import com.cognizant.springhibernate.employee.repo.JobHistoryRepo;
import com.cognizant.springhibernate.employee.repo.JobsRepo;
import com.cognizant.springhibernate.employee.repo.LocationsRepo;
import com.cognizant.springhibernate.employee.repo.RegionsRepo;



@RestController
@RequestMapping("/api")
public class MappingController {

	@Autowired
	private RegionsRepo regionsRepo;

	@Autowired
	private CountriesRepo countriesRepo;
	
	@Autowired
	private LocationsRepo locationsRepo;
	
	@Autowired
	private EmployeesRepo empRepo;
	
	@Autowired
	private DepartmentsRepo depRepo;
	
	@Autowired
	private JobHistoryRepo jobHistoryRepo;
	
	@Autowired
	private JobsRepo jobsRepo;

	@PostMapping("/region")
	public Regions saveRegion(@RequestBody Regions region) {
		regionsRepo.save(region);
		return region;
	}

	@GetMapping("/region")
	public List<Regions> getRegion() {
		return (List<Regions>) regionsRepo.findAll();
	}

	@PostMapping("/country")
	public Countries saveCountry(@RequestBody Countries countries) {
		countriesRepo.save(countries);
		return countries;
	}

	@GetMapping("/country")
	public List<Countries> getCountry() {
		return (List<Countries>) countriesRepo.findAll();
	}
	
	@PostMapping("/location")
	public Locations saveLocation(@RequestBody Locations locations) {
		locationsRepo.save(locations);
		return locations;
	}

	@GetMapping("/location")
	public List<Locations> getLocation() {
		return (List<Locations>) locationsRepo.findAll();
	}
	
	@PostMapping("/dept")
	public Departments savedept(@RequestBody Departments dept) {
		depRepo.save(dept);
		return dept;
	}

	@GetMapping("/dept")
	public List<Departments> getdept() {
		return (List<Departments>) depRepo.findAll();
	}
	
	@PostMapping("/employees")
	public Employees saveEmp(@RequestBody Employees emp) {
		empRepo.save(emp);
		return emp;
	}

	@GetMapping("/employees")
	public List<Employees> getEmp() {
		return (List<Employees>) empRepo.findAll();
	}

	@PostMapping("/jobhistory")
	public JobHistory saveJobHistory(@RequestBody JobHistory obj) {
		jobHistoryRepo.save(obj);
		return obj;
	}

	@GetMapping("/jobhistory")
	public List<JobHistory> getJobHistory() {
		return (List<JobHistory>) jobHistoryRepo.findAll();
	}
	
	@PostMapping("/jobs")
	public Jobs savejobs(@RequestBody Jobs job) {
		jobsRepo.save(job);
		return job;
	}

	@GetMapping("/jobs")
	public List<Jobs> getjobs() {
		return (List<Jobs>) jobsRepo.findAll();
	}

}
