package data;

import lombok.Data;

import java.util.UUID;

import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Book {
    private UUID id;
    private String title;
    private String author;
    private String description;
}
