package services;

import java.util.UUID;

public interface BooksService {
    UUID createBook(String name, String author, String description);
    void deleteBook(UUID ID);
}