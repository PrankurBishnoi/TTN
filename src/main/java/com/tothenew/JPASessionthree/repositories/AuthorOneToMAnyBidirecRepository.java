package com.tothenew.JPASessionthree.repositories;

import com.tothenew.JPASessionthree.entities.onetomany.bidirectional.AuthorBi;
import com.tothenew.JPASessionthree.entities.onetomany.unidirectional.AuthorUni;
import org.springframework.data.repository.CrudRepository;

public interface AuthorOneToMAnyBidirecRepository extends CrudRepository<AuthorBi,Integer>
{
}
