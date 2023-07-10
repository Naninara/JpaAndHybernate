package com.example.JPA.JPA;

import com.example.JPA.JPA.Model.BookModel;
import com.example.JPA.JPA.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Autowired
	BookRepository repo;

	@Autowired
	JpaRepository<BookModel,Integer> jp;

	@Override
	public void run(String... args) throws Exception {

		BookModel b = new BookModel("Soring","Mavin");

		repo.save(b);
		//System.out.println(repo.findByAuthor("Mavin"));
		//System.out.println(repo.findById(2));
//		System.out.println(repo.findByNameOfBook("Spring"));
//		System.out.println(repo.findByAuthorName("sudheer"));
	}
}
