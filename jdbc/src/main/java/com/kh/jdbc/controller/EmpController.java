package com.kh.jdbc.controller;

import com.kh.jdbc.dao.EmpDAO;
import com.kh.jdbc.vo.EmpVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// 인터넷 크롬에 치기 : localhost:8111/emp/select
// 여기는 emp select 호출문 입니다. -> 콘솔에 뜸
@Controller
@RequestMapping("/emp")
public class EmpController {
    @GetMapping("/select")
    public String selectEmp(Model model) { // view로 모델을 넘겨주는 객체
       // 웹가서 화면 확인
//        System.out.println("여기는 emp select 호출문 입니다.");
//        return "test";
        // 디비 연결
        EmpDAO dao = new EmpDAO();
        List<EmpVO> emps = dao.empSelect();
        model.addAttribute("employees",emps); // db정보 가져와서 채움
        return "thymeleafEx/empSelect";
        // http://localhost:8111/emp/select
    }
    @GetMapping("/insert")
    public String insertViewEmp(Model model) {// view로 모델을 넘겨주는 객체
        model.addAttribute("employees", new EmpVO()); // 빈 객체를 만들어서 model-view에 넣어줌, 입력을 받아야해서
        return "thymeleafEx/empInsert";
        // http://localhost:8111/emp/insert
    }
    @PostMapping("/insert")
    public String insertDBEmp(@ModelAttribute("employees")EmpVO empVO) {
        EmpDAO dao = new EmpDAO();
        dao.empInsert(empVO);
        return "thymeleafEx/empInsertRst";
        // http://localhost:8111/emp/select
    }
}
