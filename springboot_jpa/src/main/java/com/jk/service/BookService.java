/**
 * Copyright (C), jk
 * FileName: BookService
 * Author:   wyl
 * Date:     2019/4/11 18:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.model.BookBean;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
public interface BookService {

    List<BookBean> findBookList();

    void addBook(BookBean bookBean);

    void deleteBook(BookBean book);

    BookBean findBookById(BookBean book);

    void updateBook(BookBean returnBook);
}
