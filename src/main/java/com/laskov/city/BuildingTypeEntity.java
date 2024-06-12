package com.laskov.city;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BuildingTypeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long id;
	
	@Basic(optional = false)
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