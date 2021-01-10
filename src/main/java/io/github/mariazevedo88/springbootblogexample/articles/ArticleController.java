package io.github.mariazevedo88.springbootblogexample.articles;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/articles")
public class ArticleController {
	
	@GetMapping
    public String allArticles(Model model) {
        model.addAttribute("articles", fetchArticles());
        return "articles/articles-list";
    }

    private List<Article> fetchArticles() {
        return Arrays.asList(
        		new Article(
        			"Construindo uma API RESTful com Java e Spring Framework — Parte 1",
        			"https://bit.ly/3brdwsM"
        		),
        		new Article(
        			"Construindo uma API RESTful com Java e Spring Framework — Parte 2",
        			"https://bit.ly/3hYawFw"
        		),
        		new Article(
        			"Construindo uma API RESTful com Java e Spring Framework — Parte 3",
        			"https://bit.ly/3q6KYZH"
        		),
        		new Article(
        			"Construindo uma API RESTful com Java e Spring Framework — Parte 4",
        			"https://bit.ly/39dHP3y"
        		)
        );
    }

}
