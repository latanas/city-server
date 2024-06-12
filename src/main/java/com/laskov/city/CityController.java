package com.laskov.city;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Any other server methods that are not part of the JPA Data repository
//
@RestController
public class CityController {
	
	@GetMapping("/")
	public String index() {
		return "City Server";
	}
}
