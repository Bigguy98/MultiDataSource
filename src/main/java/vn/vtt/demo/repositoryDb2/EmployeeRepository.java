package vn.vtt.demo.repositoryDb2;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.vtt.demo.domainDb2.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
