package com.test.GithubTest;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class JinuController {
    public void FunctionA(){
        System.out.println("A 기능 구현 성공!!! pull request하구 merge 기다리는 중 !! ㅎㅎ");
        System.out.println(" 코드를 갈아 엎었다");
    }
    public void testLocal(){
        System.out.println("local 브랜치 옮길때 어떻게 되는가 테스트");
    }
}
