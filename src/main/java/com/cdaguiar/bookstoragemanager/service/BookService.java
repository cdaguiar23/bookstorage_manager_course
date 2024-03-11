package com.cdaguiar.bookstoragemanager.service;

import com.cdaguiar.bookstoragemanager.dto.MessageResponseDTO;
import com.cdaguiar.bookstoragemanager.entity.Book;
import com.cdaguiar.bookstoragemanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Livro criado com ID " + savedBook.getId())
                .build();
    }
}
