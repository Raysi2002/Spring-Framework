package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/index.jsp")
    public ModelAndView openIndexPage(){
        ModelAndView mav = new ModelAndView();

        return mav;
    }
}
