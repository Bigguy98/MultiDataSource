package vn.vtt.demo.repositoryDb2;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.vtt.demo.domainDb2.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {
}
