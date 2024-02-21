package com.example.book_demo.service.impl;

import com.example.book_demo.pojo.Book;
import com.example.book_demo.mapper.BookDao;
import com.example.book_demo.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author laobashisuanle
 * @since 2024-02-02
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

}
