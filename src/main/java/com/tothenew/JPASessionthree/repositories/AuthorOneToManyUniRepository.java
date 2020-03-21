package com.tothenew.JPASessionthree.repositories;

import com.tothenew.JPASessionthree.entities.onetomany.unidirectional.AuthorUni;
import com.tothenew.JPASessionthree.entities.onetoone.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorOneToManyUniRepository extends CrudRepository<AuthorUni,Integer>
{

}
