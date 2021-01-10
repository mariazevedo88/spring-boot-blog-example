package io.github.mariazevedo88.springbootblogexample.blog;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
	
	private long blogId;

    private String title;

    private String body;

    private String author;

    private String category;

    private Date publishedDate;

}
