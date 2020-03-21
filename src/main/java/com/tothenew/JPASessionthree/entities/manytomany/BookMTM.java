package com.tothenew.JPASessionthree.entities.manytomany;

import com.tothenew.JPASessionthree.entities.onetomany.bidirectional.AuthorBi;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BookMTM
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

//    private  String subject;


    @ManyToMany(mappedBy = "bookMTM")
    Set<AuthorMTM> authorMTM;

    public BookMTM()
    {
    }

    public BookMTM(String name, Set<AuthorMTM> authorMTM) {
        this.name = name;
        //this.subject = subject;
        this.authorMTM = authorMTM;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//
//    public String getSubject() {
//        return subject;
//    }
//
//    public void setSubject(String subject) {
//        this.subject = subject;
//    }


    public Set<AuthorMTM> getAuthorMTM() {
        return authorMTM;
    }

    public void setAuthorMTM(Set<AuthorMTM> authorMTM) {
        this.authorMTM = authorMTM;
    }

    @Override
    public String toString() {
        return "BookMTM{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorBi=" + authorMTM +
                '}';
    }
}
