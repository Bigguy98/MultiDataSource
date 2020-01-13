package vn.vtt.demo.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.vtt.demo.domainDb2.Branch;
import vn.vtt.demo.repositoryDb2.BranchRepository;

import java.util.List;

@RestController
@RequestMapping("/branch")
public class BranchResource {
    @Autowired private BranchRepository branchRepository;

    @GetMapping("/getAll")
    public List<Branch> getAll() {
        return branchRepository.findAll();
    }
}
