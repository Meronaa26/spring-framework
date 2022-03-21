package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String showForm(Model model){
        model.addAttribute("mentor",new Mentor());
        List<String>bacthList= Arrays.asList("Jd1","JD2","EU1","EU2","B18","B20");
        model.addAttribute("batchList",bacthList);
        return "mentor/mentor-register";
    };
    @PostMapping("/confirm")
    public String showForm2(@ModelAttribute("mentor") Mentor mentor ){
      //  System.out.println(mentor.toString());
         return "redirect:/mentor/register";
     //  return "mentor/mentor-confirmation";
    }
}
