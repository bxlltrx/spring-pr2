package com.example.library.service;

import com.example.library.model.Author;
import com.example.library.repo.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository repo;

    public AuthorService(AuthorRepository repo) {
        this.repo = repo;
    }

    public List<Author> findAll() {
        return repo.findAll();
    }

    public Author findById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Author not found: " + id));
    }

    public Author save(Author author) {
        return repo.save(author);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
