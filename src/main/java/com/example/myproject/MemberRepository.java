package com.example.myproject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // 기본 CRUD 제공됨
}
