package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookRepository bookRepository = context.getBean("bookRepository", BookRepository.class);

        BookService bookService = context.getBean("bookService", BookService.class);

        bookRepository.test();
        bookService.test();
    }
}
