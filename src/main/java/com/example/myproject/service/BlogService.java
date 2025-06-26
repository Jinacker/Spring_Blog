package com.example.myproject.service;

import com.example.myproject.domain.Article;
import com.example.myproject.dto.AddArticleRequest;
import com.example.myproject.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
    // 블로그 글 모두 가져오기
    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
