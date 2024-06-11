package com.laskov.city;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class BuildingEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id") 
	private Long id;
	
	private Long x;
	private Long y;

	@ManyToOne
	private BuildingTypeEntity type;

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
