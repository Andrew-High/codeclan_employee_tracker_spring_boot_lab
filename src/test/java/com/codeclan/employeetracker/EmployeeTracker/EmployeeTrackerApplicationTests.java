package com.codeclan.employeetracker.EmployeeTracker;

import com.codeclan.employeetracker.EmployeeTracker.models.Employee;
import com.codeclan.employeetracker.EmployeeTracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee(){
		Employee employee = new Employee("Joe", 43, 12345, "joe@joesemail.com");
		employeeRepository.save(employee);
	}

}
