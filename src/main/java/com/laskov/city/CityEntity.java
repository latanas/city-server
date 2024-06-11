package com.laskov.city;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class CityEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id") 
	private Long id;

	private String name;

	@OneToMany
	private List<BuildingEntity> buildings;
	
	protected CityEntity() {}

	public CityEntity(String name, List<BuildingEntity> buildings) {
		this.name = name;
		this.buildings = buildings;
	}

	@Override
	public String toString() {
		return String.format("[id=%d, name='%s', buildings='%s']", id, name, buildings);
	}

	public Long getId() {
	  return id;
	}

	public String getName() {
	  return name;
	}
	
	public List<BuildingEntity> getBuildings() {
		return buildings;
	}
}
