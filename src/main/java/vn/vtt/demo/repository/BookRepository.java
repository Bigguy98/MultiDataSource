package vn.vtt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.vtt.demo.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
