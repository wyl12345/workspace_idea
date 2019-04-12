/**
 * Copyright (C), jk
 * FileName: BookMapper
 * Author:   wyl
 * Date:     2019/4/11 18:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.dao;

import com.jk.model.BookBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
@Repository
public interface BookDao extends JpaRepository<BookBean,Integer> {

    @Query(value="select id,bookName,bookDate,bookPrice,typeId from BookBean ")
    List<BookBean> findBookList();
}
