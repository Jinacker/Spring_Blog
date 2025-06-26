package com.example.myproject;

import jakarta.persistence.*; // JPA
import lombok.*;             // Lombok

@Entity // DB에 매핑될 클래스
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자 생성
@AllArgsConstructor // 전체 필드 생성자
public class Member {

    @Id // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(nullable = false) // not null 설정
    private String name;
}
