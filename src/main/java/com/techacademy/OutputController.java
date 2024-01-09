package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postForm(@RequestParam(name = "val",required = false) String val,Model model) {

        model.addAttribute("val" , val);
        return "output";


    }
}
