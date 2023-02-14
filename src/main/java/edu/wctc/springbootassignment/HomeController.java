package edu.wctc.springbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }

    @RequestMapping("/step-one")
    public String showStepOne(){
        return "pages/Step1";
    }

    @RequestMapping("/step-two")
    public String showStepTwo(){
        return "pages/Step2";
    }

    @RequestMapping("/step-three")
    public String showStepThree(){
        return "pages/Step3";
    }

    @RequestMapping("/more-info")
    public String redirectToWebsite(){
        return "redirect:https://www.wikihow.com/Perform-the-Heimlich-Maneuver-on-Yourself";
    }
}
