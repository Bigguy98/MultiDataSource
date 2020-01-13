package vn.vtt.demo.web.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.vtt.demo.domain.User;
import vn.vtt.demo.domainDb2.Employee;
import vn.vtt.demo.repository.UserRepository;
import vn.vtt.demo.repositoryDb2.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestResource {
    @Autowired private UserRepository userRepository;
    @Autowired private EmployeeRepository employeeRepository;

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
