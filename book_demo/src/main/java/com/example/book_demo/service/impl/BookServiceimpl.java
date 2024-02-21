package com.example.book_demo.service.impl;

import com.example.book_demo.mapper.BookDAO;
import com.example.book_demo.pojo.Book;
import com.example.book_demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceimpl implements BookService{

    @Autowired
    private BookDAO bookDAO;


    @Override
    public List<Book> list() {
        return bookDAO.list();
    }

    @Override
    public Book getById(Integer id) {
        return bookDAO.getById(id);
    }

    @Override
    public boolean update(Book book) {
        return bookDAO.update(book);
    }

    @Override
    public boolean add(Book book) {
        return bookDAO.add(book);
    }

    @Override
    public boolean delete(Integer id) {
        return bookDAO.delete(id);
    }


}
