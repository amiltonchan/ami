package jp.co.f1.spring.helloworld;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

 

@RestController

public class HelloController {

 

  // 「/hello」へアクセスがあった場合

  @RequestMapping("/hello")

  public String helloWorld() {

    // 文字列を返す

    return "/index.html";

  }

 

}
