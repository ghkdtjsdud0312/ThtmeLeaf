package com.kh.jdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// 인터넷 크롬에 치기 : localhost:8111/emp/select
@Controller
@RequestMapping("/emp")
public class EmpController {
    @GetMapping("/select")
    public String selectEmp(Model model) {
        System.out.println("여기는 emp select 호출문 입니다.");
        return "test";
    }
}
