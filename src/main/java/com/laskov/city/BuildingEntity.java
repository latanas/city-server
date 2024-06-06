package com.laskov.city;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BuildingEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private BuildingTypeEntity type;
	
	protected BuildingEntity() {}

	public BuildingEntity(BuildingTypeEntity type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("BuildingEntity[id=%d, type='%s']", id, type);
	}

	public Long getId() {
	  return id;
	}

	public BuildingTypeEntity getType() {
	  return type;
	}
}
