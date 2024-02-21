package com.example.book_demo.service;

import com.example.book_demo.pojo.Book;
import com.example.book_demo.service.impl.BookServiceimpl;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    List<Book> list();

    Book getById(Integer id);

    boolean update(Book book);

    boolean add(Book book);

    boolean delete(Integer id);
}
