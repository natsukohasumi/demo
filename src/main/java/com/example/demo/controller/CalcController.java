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
    public String receiveCalc(Integer num1, Integer num2, String operator,Model model){
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        if (operator == "add"){
            model.addAttribute("answer", num1+num2);
        } else if (operator == "subtract"){
            model.addAttribute("answer", num1-num2);
        } else if (operator == "multiple"){
            model.addAttribute("answer", num1*num2);
        } else {
            model.addAttribute("answer", num1/num2);
        }
        
        return "result-calc";

    }

}
