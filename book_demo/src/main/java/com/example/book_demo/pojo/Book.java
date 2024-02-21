package com.example.book_demo.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Book {
    @TableId
    private Integer id;
    private String name;
    private double price;
}
