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
	private Long x;
	private Long y;

	protected BuildingEntity() {}

	public BuildingEntity(BuildingTypeEntity type, Long x, Long y) {
		this.type = type;
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("BuildingEntity[id=%d, type='%s', x='%d', y='%d']", id, type, x, y);
	}

	public Long getId() {
		return id;
	}

	public BuildingTypeEntity getType() {
		return type;
	}

	public Long getX() {
		return x;
	}

	public Long getY() {
		return y;
	}
}
