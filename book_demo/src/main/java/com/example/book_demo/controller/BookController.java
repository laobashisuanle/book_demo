package com.example.book_demo.controller;

import com.example.book_demo.pojo.Book;
import com.example.book_demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {


@Autowired
private BookService bookService;
     @GetMapping
     @ResponseBody
    public List<Book> list(){
        return bookService.list();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Book getById(@PathVariable("id")Integer id){
         return bookService.getById(id);
    }
    @PutMapping
    @ResponseBody
    public boolean update(@RequestBody Book book){
         return bookService.update(book);
    }

    @PostMapping
    @ResponseBody
    public boolean add(@RequestBody  Book book){
         return bookService.add(book);
    }
    @DeleteMapping("/{id}")
    @ResponseBody
    public boolean delete(@PathVariable("id") Integer id){
         return bookService.delete(id);
    }
}
