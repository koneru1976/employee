package com.rkoneru.sample.repository;

import com.rkoneru.sample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
