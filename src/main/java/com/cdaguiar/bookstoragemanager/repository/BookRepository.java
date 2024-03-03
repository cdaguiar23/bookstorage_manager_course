package com.cdaguiar.bookstoragemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdaguiar.bookstoragemanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
