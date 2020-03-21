package com.tothenew.JPASessionthree.entities.onetoone;

import com.tothenew.JPASessionthree.entities.Address;

import javax.persistence.*;
import javax.security.auth.Subject;
import java.util.List;
import java.util.Set;

@Entity
public class Author
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    private  String name;

    //Q2.Create instance variable of Address class
    // inside Author class and save it as embedded object.
    @Embedded
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author(Address address, Set<String> subjects) {
        //this.id = id;
        this.address = address;
      //  this.book = book;
        this.subjects = subjects;
    }

    public Author() {
    }

    @OneToOne(cascade =CascadeType.ALL)
    @JoinTable(name = "author_book",
            joinColumns =
                    { @JoinColumn(name = "author_id", referencedColumnName = "id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "book_id", referencedColumnName = "bookid") })

    Book book;

    //Q3.Introduce a List of subjects for author.
    @ElementCollection
    private Set<String> subjects;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", address=" + address +
                ", book=" + book +
                ", subjects=" + subjects +
                '}';
    }
}
