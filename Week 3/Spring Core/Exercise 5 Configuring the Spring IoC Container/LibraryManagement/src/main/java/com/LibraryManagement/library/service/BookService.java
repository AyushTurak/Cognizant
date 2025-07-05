package com.LibraryManagement.library.service;

import com.LibraryManagement.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String book) {
        System.out.println("Adding book to service: " + book);
        bookRepository.saveBook(book);
    }
}
