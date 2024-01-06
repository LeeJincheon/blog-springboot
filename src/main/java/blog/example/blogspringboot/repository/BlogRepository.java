package blog.example.blogspringboot.repository;

import blog.example.blogspringboot.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

// <엔티티(Article), 엔티티 pk 타입(Long)>
public interface BlogRepository extends JpaRepository<Article, Long> {
}
