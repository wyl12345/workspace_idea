/**
 * Copyright (C), jk
 * FileName: BookServiceImpl
 * Author:   wyl
 * Date:     2019/4/11 18:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl;

import com.jk.dao.BookDao;
import com.jk.model.BookBean;
import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookMapper;

    @Override
    public List<BookBean> findBookList() {
        return bookMapper.findAll();
    }

    @Override
    public void addBook(BookBean bookBean) {

        bookMapper.save(bookBean);
    }

    @Override
    public void deleteBook(BookBean book) {
        bookMapper.delete(book);
    }

    @Override
    public BookBean findBookById(BookBean book) {

        return bookMapper.getOne(book.getId());
    }

    @Override
    public void updateBook(BookBean returnBook) {
        bookMapper.save(returnBook);
    }
}
