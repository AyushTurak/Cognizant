package com.LibraryManagement.library;

import com.LibraryManagement.library.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(LibraryApplication.class, args);

		BookService bookService = context.getBean("bookService", BookService.class);

		bookService.findId(12321);
	}

}
