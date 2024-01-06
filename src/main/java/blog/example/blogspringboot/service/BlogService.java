package blog.example.blogspringboot.service;

import blog.example.blogspringboot.domain.Article;
import blog.example.blogspringboot.dto.AddArticleRequest;
import blog.example.blogspringboot.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
