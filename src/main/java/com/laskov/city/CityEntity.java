package com.laskov.city;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class CityEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
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
