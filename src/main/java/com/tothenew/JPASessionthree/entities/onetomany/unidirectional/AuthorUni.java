package com.tothenew.JPASessionthree.entities.onetomany.unidirectional;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AuthorUni
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn
    Set<BookUni> bookunis;

    @ElementCollection
    private Set<String> subjects;

    public AuthorUni() {
    }

    public AuthorUni(String name, Set<BookUni> bookunis, Set<String> subjects) {
        this.name = name;
        this.bookunis = bookunis;
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

    public Set<BookUni> getBookunis() {
        return bookunis;
    }

    public void setBookunis(Set<BookUni> bookunis) {
        this.bookunis = bookunis;
    }

}
