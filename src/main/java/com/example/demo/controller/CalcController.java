package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("request-calc")
public class CalcController {

    @RequestMapping("")
    public String index(){
        return "calc-form";
    }

    @RequestMapping("receive-calc")
    public String receiveCalc(String num1, String num2, Model model){
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("answer", Integer.parseInt(num1)+Integer.parseInt(num2));
        return "result-calc";

    }

}
