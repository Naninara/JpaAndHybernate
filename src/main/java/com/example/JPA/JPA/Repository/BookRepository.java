package com.example.JPA.JPA.Repository;

import com.example.JPA.JPA.Model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Book;
import java.util.List;

public interface BookRepository extends JpaRepository<BookModel,Integer> {
    public List<BookModel> findByAuthor(String author);

    public  BookModel findById(int id);

    @Query("select b from BookModel b where b.name =:name ")
    public List<BookModel> findByNameOfBook(String name);
    @Query(value = "select * from book_model b  where b.author=:author" , nativeQuery = true)
    public List<BookModel> findByAuthorName(String author);


}
