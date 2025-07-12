package com.ishanya.LibraryManagement.controller;

import com.ishanya.LibraryManagement.model.Book;
import com.ishanya.LibraryManagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    private Book getBook(@PathVariable Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book newBook) {
        Book existingBook = bookRepository.findById(id).orElse(null);

        if (existingBook != null) {
            existingBook.setIsbn(newBook.getIsbn());
            existingBook.setAuthor(newBook.getAuthor());
            existingBook.setTitle(newBook.getTitle());
            return bookRepository.save(existingBook);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
