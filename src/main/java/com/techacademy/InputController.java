package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InputController {

 // 入力画面の初期表示をする
 @GetMapping("/input")
 public String getInput(@RequestParam(required = false) String previous, Model model) {
     // 'previous'パラメータがあればモデルに追加
     model.addAttribute("previous", previous);
     return "input";
     }

 // 入力画面からのデータを受け取り、出力画面を表示する
 @PostMapping("/output")
 public String postOutput(@RequestParam("inputValue") String inputValue, Model model) {
     model.addAttribute("inputValue", inputValue);
     return "output";
     }
}
