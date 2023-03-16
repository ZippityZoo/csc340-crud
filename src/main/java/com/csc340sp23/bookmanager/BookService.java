/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340sp23.bookmanager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author CollinHarris
 */
@Service
public class BookService {
    
    @Autowired
    private BookRepository repo;
    
    void saveBook(Book book){
        repo.save(book);
    }
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Book getBook(long bookId) {
        return repo.getReferenceById(bookId);
    }

    public void deleteBook(long bookId) {
        repo.deleteById(bookId);
    }
    
}
