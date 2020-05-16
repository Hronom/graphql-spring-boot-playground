package com.github.hronom.graphqlspringbootplayground.graphql;

import lombok.Data;

@Data
public class Post {
    private String id;
    private String title;
    private String text;
    private String category;
    private String authorId;

    private int randomNumber;
}
