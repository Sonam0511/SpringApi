package Org.Example.SpringApi.Repository;

import Org.Example.SpringApi.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
