package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/login")
    public ModelAndView openLoginPage(){
        System.out.println("Login page executed");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }


    @RequestMapping("/signup")
    public String openSignupPage(){
        System.out.println("Signup page executed");
        return "signup";
    }
}
//@GetMapping("/login")
//public ModelAndView openLoginPage() {
//    System.out.println("Login page executed");
//    return new ModelAndView("login");
//}
//
//        @GetMapping("/signup")
//        public ModelAndView openSignupPage() {
//            return new ModelAndView("signup");
//        }

