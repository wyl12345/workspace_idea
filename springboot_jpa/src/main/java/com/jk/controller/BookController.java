/**
 * Copyright (C), jk
 * FileName: BookController
 * Author:   wyl
 * Date:     2019/4/11 18:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;


import com.jk.model.BookBean;
import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("toBook")
    public String toBook(){

        return "book";
    }
    @RequestMapping("toAdd")
    public String toAdd(){

        return "addUser";
    }
    @RequestMapping("toUpdate")
    public String toUpdate(){

        return "updateUser";
    }
    @RequestMapping("findBookList")
    @ResponseBody
    public List<BookBean> findBookList(){

        return bookService.findBookList();
    }
    @RequestMapping("addBook")
    @ResponseBody
    public void addBook(BookBean bookBean){

        bookService.addBook(bookBean);
    }

    @RequestMapping("delUser")
    @ResponseBody
    public void deleteBook(Integer id){
        BookBean book=new BookBean();
        book.setId(id);
        bookService.deleteBook(book);
    }
    @RequestMapping("findBookById")
    @ResponseBody
    public void findBookById(Integer id){
        BookBean book=new BookBean();
        book.setId(id);

        BookBean returnBook = bookService.findBookById(book);

        bookService.updateBook(returnBook);
    }
}
