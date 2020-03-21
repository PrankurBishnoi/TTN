package com.tothenew.JPASessionthree.repositories;

import com.tothenew.JPASessionthree.entities.manytomany.AuthorMTM;
import org.springframework.data.repository.CrudRepository;

public interface Authormanytomanyrepository extends CrudRepository<AuthorMTM,Integer>
{
}
