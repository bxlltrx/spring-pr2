package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.repo.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> findAll() {
        return repo.findAll();
    }

    public Book findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Book not found: " + id));
    }

    public Book save(Book book) {
        return repo.save(book);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
