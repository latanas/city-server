package com.laskov.city;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CityController {
	
	@GetMapping("/")
	public String index() {
		return "City Server";
	}
}
