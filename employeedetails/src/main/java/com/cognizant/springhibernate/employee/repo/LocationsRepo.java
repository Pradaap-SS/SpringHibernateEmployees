package com.cognizant.springhibernate.employee.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.springhibernate.employee.model.Locations;



@Repository
public interface LocationsRepo extends CrudRepository<Locations, Integer> {

}
