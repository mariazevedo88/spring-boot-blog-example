package io.github.mariazevedo88.springbootblogexample.blog;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/blog")
public class BlogController {
	
	@GetMapping("/new")
    public String newBlogPost(Model model) {
        
		// Set a random ID so we can see it in the HTML form
        Blog blog = new Blog();
        blog.setBlogId(Math.abs(new Random().nextLong() % 1000000));

        model.addAttribute("blog", blog);

        return "blog/blog-new";
    }
	

}
