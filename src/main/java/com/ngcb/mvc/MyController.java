package com.ngcb.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class MyController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/greetings")
    public String index(@RequestParam(defaultValue = "null") String empName , Model model){
        model.addAttribute("name",empName);
        return "greetings";
    }

}
