package main.java.name.ogisui.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello-0.1/hello")
public class HelloController {

  @GetMapping("/index")
  public String indexGet() {
    return "hello/index";
  }
}