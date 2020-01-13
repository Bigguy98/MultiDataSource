package vn.vtt.demo.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.vtt.demo.domain.Book;
import vn.vtt.demo.repository.BookRepository;

import java.util.List;

@RestController
    @RequestMapping("/book")
public class BookResource {

    @Autowired private BookRepository bookRepository;
    @GetMapping("/getAll")
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
