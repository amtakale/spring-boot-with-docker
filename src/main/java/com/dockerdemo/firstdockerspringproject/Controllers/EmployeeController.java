package com.dockerdemo.firstdockerspringproject.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@GetMapping
	public List<String> getAllEmployeeNames() {
		return Arrays.asList("John Doe","Steve D'Suza","Amit T");
	}
}