package com.example.myproject;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test") // localhost:8080/test
    public List<Member> getAllMembers() {
        // 회원 리스트 반환
        return testService.getAllMembers();
    }
}
