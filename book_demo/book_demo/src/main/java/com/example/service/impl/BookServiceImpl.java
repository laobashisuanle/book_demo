package com.example.service.impl;

import com.example.pojo.Book;
import com.example.mapper.BookMapper;
import com.example.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LIFEILIN
 * @since 2024-02-02
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
