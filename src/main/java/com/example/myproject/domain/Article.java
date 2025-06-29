package com.example.myproject.domain;

import jakarta.persistence.*;       // JPA
import lombok.*;                   // Lombok (Getter, Builder, NoArgsConstructor, AccessLevel)
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity                    // 엔티티로 지정
@Getter                    // 모든 필드 getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA 기본 생성자
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder                 // 빌더 패턴
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }

    @CreatedDate // 엔티티가 생성될 때 생성 시간 저장
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate // 엔티티가 수정될 때 수정 시간 저장
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
