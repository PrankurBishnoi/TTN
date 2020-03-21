package com.tothenew.JPASessionthree.entities.onetomany.bidirectional;

import javax.persistence.*;

@Entity
public class BookBi
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private  String subject;


    public AuthorBi getAuthorBi() {
        return authorBi;
    }

    public void setAuthorBi(AuthorBi authorBi) {
        this.authorBi = authorBi;
    }

    @ManyToOne
    @JoinColumn(name="author_id")
    AuthorBi authorBi;

    @Override
    public String toString() {
        return "BookUni{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public BookBi(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public BookBi() {
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
}
