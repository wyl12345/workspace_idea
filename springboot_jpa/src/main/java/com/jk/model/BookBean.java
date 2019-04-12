/**
 * Copyright (C), jk
 * FileName: BookBean
 * Author:   wyl
 * Date:     2019/4/11 18:33
 */
package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
@Entity
@Table(name="t_book")
public class BookBean implements Serializable {
    private static final long serialVersionUID = -3363681305945128825L;
    @Id
    @GeneratedValue
    private Integer id;
    private String bookName;
    @CreatedDate
    @JsonFormat(pattern="yyyy-MM-dd ")
    private Date bookDate;
    private Double bookPrice;
    private Integer typeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
