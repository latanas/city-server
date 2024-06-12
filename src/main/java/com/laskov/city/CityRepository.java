package com.laskov.city;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// JPA Data repository provides automatic "CRUD" operations (Create/Update/Destroy) for the City entity
//
@RepositoryRestResource(collectionResourceRel = "city", path = "city")	
public interface CityRepository extends PagingAndSortingRepository<CityEntity, Long>, CrudRepository<CityEntity, Long> {
	List<CityEntity> findByName(@Param("name") String name);
}
