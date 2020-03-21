package com.tothenew.JPASessionthree.services;

import com.tothenew.JPASessionthree.entities.Address;
import com.tothenew.JPASessionthree.entities.Subject;
import com.tothenew.JPASessionthree.entities.manytomany.AuthorMTM;
import com.tothenew.JPASessionthree.entities.manytomany.BookMTM;
import com.tothenew.JPASessionthree.entities.onetomany.bidirectional.AuthorBi;
import com.tothenew.JPASessionthree.entities.onetomany.bidirectional.BookBi;
import com.tothenew.JPASessionthree.entities.onetomany.unidirectional.AuthorUni;
import com.tothenew.JPASessionthree.entities.onetomany.unidirectional.BookUni;
import com.tothenew.JPASessionthree.entities.onetoone.Author;
import com.tothenew.JPASessionthree.entities.onetoone.Book;
import com.tothenew.JPASessionthree.repositories.Authormanytomanyrepository;
import com.tothenew.JPASessionthree.repositories.AuthorOneToMAnyBidirecRepository;
import com.tothenew.JPASessionthree.repositories.AuthorOneToManyUniRepository;
import com.tothenew.JPASessionthree.repositories.Authoronetoonerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ServiceClass
{
    @Autowired
    Authoronetoonerepository authoronetoonerepository;

    @Autowired
    AuthorOneToManyUniRepository authorOneToManyUniRepository;
    @Autowired
    AuthorOneToMAnyBidirecRepository authorOneToMAnyBidirecRepository;

    @Autowired
    Authormanytomanyrepository authorManyToManyrepository;


    //Q6.Implement One to One mapping between Author and Book

    public void oneToOneMapping()
    {
        //Q4 Persist 3 subjects for each author.

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(Subject.COMPUTERSCIENCE.toString());
		hashSet.add(Subject.ENGLISH.toString());
		hashSet.add(Subject.MATH.toString());

		authoronetoonerepository.save( new Author(new Address(5,"Noida","UttarPradesh"),hashSet));
    }

    public void updateDataOneToone()
    {

		Optional<Author> author = authoronetoonerepository.findById(1);
		if(author.isPresent())
		{
			Author author1 =  author.get();
			Set<String> hashSet = author1.getSubjects();
			author1.setName("Shivam Agarwal");
			author1.setBook(new Book("SK Goel",Subject.MATH.toString()));
			authoronetoonerepository.save(author1);

		}
    }
    //Q7.Implement One to Many Mapping between Author and Book(Unidirectional
    // and without additional table ) and implement cascade save.
   public  void oneToMAnyUniDirectioinal()
    {

        Set<BookUni> books = new HashSet<BookUni>();
        books.add(new BookUni("WresnicHAlliday",Subject.PHYSICS.toString()));
        books.add(new BookUni("SK Goel",Subject.MATH.toString()));

        HashSet<String> subjects = new HashSet<String>();
		subjects.add(Subject.COMPUTERSCIENCE.toString());
		subjects.add(Subject.PHYSICS.toString());
		subjects.add(Subject.MATH.toString());
        AuthorUni authorUni = new AuthorUni("Shivam Agarwal",books,subjects);

        authorOneToManyUniRepository.save(authorUni);
    }

    //Q7.Implement One to Many Mapping between Author and Book( BiDirectional and
    // without additional table ) and implement cascade save.
    public  void oneToMAnyBiDirectioinal()
    {

        AuthorBi authorBi = new AuthorBi();
        authorBi.setName("Shivam Agarwal");
        HashSet<String> subjects = new HashSet<String>();
        subjects.add(Subject.COMPUTERSCIENCE.toString());
        subjects.add(Subject.PHYSICS.toString());
        subjects.add(Subject.MATH.toString());
        authorBi.setSubjects(subjects);

        BookBi bookBi1 = new BookBi("WresnicHAlliday",Subject.PHYSICS.toString());
        BookBi bookBi2 = new BookBi("SK Goel",Subject.MATH.toString());
        authorBi.addBooks(bookBi1);
        authorBi.addBooks(bookBi2);





        authorOneToMAnyBidirecRepository.save(authorBi);
    }

    //Q8.Implement Many to Many Mapping between Author and Book.
    public void manyToManyMapping()
    {
        AuthorMTM authorMTM1 = new AuthorMTM();
        AuthorMTM authorMTM2 = new AuthorMTM();

        BookMTM book1 = new BookMTM();
        BookMTM book2 = new BookMTM();

        HashSet<String> subjects1 = new HashSet<String>();
        subjects1.add(Subject.COMPUTERSCIENCE.toString());
        subjects1.add(Subject.PHYSICS.toString());
        subjects1.add(Subject.MATH.toString());

        HashSet<String> subjects2 = new HashSet<String>();
        subjects2.add(Subject.COMPUTERSCIENCE.toString());
        subjects2.add(Subject.PHYSICS.toString());
        subjects2.add(Subject.ENGLISH.toString());

        authorMTM1.setName("Shivam Agarwal");
        authorMTM1.setSubjects(subjects1);
        authorMTM1.addBooks(book1);
        authorMTM1.addBooks(book2);
        book1.setName("Ecology");
        book2.setName("General Knowledge");
        authorManyToManyrepository.save(authorMTM1);
//
//        authorMTM2.setName("Devansh Agarwal");
//        authorMTM2.setSubjects(subjects2);
//        authorMTM2.addBooks(book2);





    }

}
