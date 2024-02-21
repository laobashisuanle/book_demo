package com.example.book_demo.mapper;

import com.example.book_demo.pojo.Book;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDAO {

    List<Book> list();

    Book getById(Integer id);


    boolean add(Book book);

    boolean delete(Integer id);

    boolean update(Book book);
}
