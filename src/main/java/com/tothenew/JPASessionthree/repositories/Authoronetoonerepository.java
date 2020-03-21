package com.tothenew.JPASessionthree.repositories;

import com.tothenew.JPASessionthree.entities.onetoone.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Authoronetoonerepository extends CrudRepository<Author,Integer>
{
    //List<Author> findByI(String name);
}
