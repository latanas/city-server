package com.laskov.city;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BuildingTypeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	
	protected BuildingTypeEntity() {}

	public BuildingTypeEntity(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("BuildingTypeEntity[id=%d, name='%s']", id, name);
	}

	public Long getId() {
	  return id;
	}

	public String getName() {
	  return name;
	}
}