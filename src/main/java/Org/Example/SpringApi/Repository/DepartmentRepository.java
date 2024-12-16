package Org.Example.SpringApi.Repository;


import Org.Example.SpringApi.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}