package com.laskov.city;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CityRepository extends CrudRepository<CityEntity, Long> {
	CityEntity findById(long id);
	List<CityEntity> findByName(String name);
}
