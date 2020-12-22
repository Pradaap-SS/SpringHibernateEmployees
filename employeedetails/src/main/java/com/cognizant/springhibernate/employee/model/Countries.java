package com.cognizant.springhibernate.employee.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Countries {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id", nullable = false)
	private int countryId;

	@Column(name = "country_name")
	private String countryName;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, targetEntity=Regions.class)
	@JoinColumn(name = "region_id")
	private List<Regions> regions = new ArrayList<>();
	
	@OneToMany(mappedBy = "countries", cascade = CascadeType.ALL)
    private List<Locations> locations;

	public Countries() {
		
	}
	
	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<Regions> getRegions() {
		return regions;
	}

	public void setRegions(List<Regions> regions) {
		this.regions = regions;
	}

}
