package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloModelController {
	@GetMapping("model")
	public String helloView(Model model) {
		// 「Model」にデータを格納する
		model.addAttribute("msg", "タイムリーフ！！！");
		// 戻り値は「ビュー名」を返す
		return "helloThymeleaf";
	}
}
