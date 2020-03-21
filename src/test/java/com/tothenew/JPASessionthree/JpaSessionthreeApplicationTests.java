package com.tothenew.JPASessionthree;

import com.tothenew.JPASessionthree.entities.Address;
import com.tothenew.JPASessionthree.entities.Subject;
import com.tothenew.JPASessionthree.entities.onetoone.Author;
import com.tothenew.JPASessionthree.entities.onetoone.Book;
import com.tothenew.JPASessionthree.repositories.Authoronetoonerepository;
import com.tothenew.JPASessionthree.services.ServiceClass;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
class JpaSessionthreeApplicationTests {

//	Autowired
//	Authoronetoonerepository authoronetoonerepository;

	@Autowired
	ServiceClass serviceClass;
	@Test
	void contextLoads() {
	}
//	@Test
//	void insertDataOneToOne()
//	{
//		HashSet<String> hashSet = new HashSet<String>();
//		hashSet.add(Subject.COMPUTERSCIENCE.toString());
//		hashSet.add(Subject.ENGLISH.toString());
//		hashSet.add(Subject.MATH.toString());
//
//		authoronetoonerepository.save( new Author(new Address(5,"Noida","UttarPradesh"),hashSet));
//
//	}
//	@Test
//	void updateDataOneToOne()
//	{
////		HashSet<String> hashSet = new HashSet<String>();
////		hashSet.add(Subject.COMPUTERSCIENCE.toString());
////		hashSet.add(Subject.ENGLISH.toString());
////		hashSet.add(Subject.MATH.toString());
////
////		authoronetoonerepository.save( new Author(new Address(5,"Noida","UttarPradesh"),hashSet));
//
//		Optional<Author> author = authoronetoonerepository.findById(1);
//		if(author.isPresent())
//		{
//			Author author1 =  author.get();
//			Set<String> hashSet = author1.getSubjects();
//			author1.setName("Shivam Agarwal");
//			author1.setBook(new Book("SK Goel",Subject.MATH.toString()));
//			authoronetoonerepository.save(author1);
//
//		}
//
//	}

//	@Test
//	void oneToMAnyUni()
//	{
//		serviceClass.
//
//	}

}
