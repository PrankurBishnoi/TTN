package com.tothenew.JPASessionthree.entities.onetomany.bidirectional;

import com.tothenew.JPASessionthree.entities.onetomany.unidirectional.BookUni;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AuthorBi
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "authorBi")
    Set<BookBi> bookbi;

    @ElementCollection
    private Set<String> subjects;

    public AuthorBi() {
    }

    public AuthorBi(String name, Set<BookBi> bookbi, Set<String> subjects) {
        this.name = name;
        this.bookbi = bookbi;
        this.subjects = subjects;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
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

    public Set<BookBi> getBookbi() {
        return bookbi;
    }

    public void setBookunis(Set<BookBi> bookbi) {
        this.bookbi = bookbi;
    }

    @Override
    public String toString() {
        return "AuthorBi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bookunis=" + bookbi +
                ", subjects=" + subjects +
                '}';
    }

   public void addBooks(BookBi bookBi)
    {
        if(this.getBookbi()==null)
        {
            bookbi = new HashSet<BookBi>();

        }
        bookBi.setAuthorBi(this);
        bookbi.add(bookBi);

    }

}
