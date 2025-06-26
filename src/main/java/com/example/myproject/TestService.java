package com.example.myproject;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // final 필드를 생성자 주입
public class TestService {

    private final MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        // 모든 회원 정보를 가져옴
        return memberRepository.findAll();
    }
}
