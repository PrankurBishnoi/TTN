package com.tothenew.JPASessionthree.entities.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Q5.Create an Entity book with an instance variable bookName
@Entity
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookid;
    private String bookname;
    //private Integer authorid;
    private String subject;

    public Book() {

    }

    public Book(String bookname, String subject) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.subject = subject;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

//    public Integer getAuthorid() {
//        return authorid;
//    }
//
//    public void setAuthorid(Integer authorid) {
//        this.authorid = authorid;
//    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
