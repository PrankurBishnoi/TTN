package com.tothenew.JPASessionthree.entities.manytomany;

import com.tothenew.JPASessionthree.entities.onetomany.bidirectional.BookBi;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class AuthorMTM
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            name = "author_books",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    Set<BookMTM> bookMTM;

    @ElementCollection
    private Set<String> subjects;

    public AuthorMTM() {
    }

    public AuthorMTM(String name, Set<BookMTM> bookMTM, Set<String> subjects) {
        this.name = name;
        this.bookMTM = bookMTM;
        this.subjects = subjects;
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

    public Set<BookMTM> getBookMTM() {
        return bookMTM;
    }

    public void setBookMTM(Set<BookMTM> bookMTM) {
        this.bookMTM = bookMTM;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "AuthorMTM{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bookMTM=" + bookMTM +
                ", subjects=" + subjects +
                '}';
    }

    public void addBooks(BookMTM bookmTM)
    {
        if(this.getBookMTM()==null)
        {
           bookMTM = new HashSet<BookMTM>();
        }
        bookMTM.add(bookmTM);
        if(bookmTM.getAuthorMTM()==null)
        {
            bookmTM.setAuthorMTM(new HashSet<AuthorMTM>());
        }
        bookmTM.getAuthorMTM().add(this);

    }
}
