package com.cognizant.springhibernate.employee.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.springhibernate.employee.model.Countries;



@Repository
public interface CountriesRepo extends CrudRepository<Countries, Integer> {

}
