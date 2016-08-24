package test.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 重定向
 * @author Edward
 *
 */
@Controller
@RequestMapping("/mvc")
public class RedirectController {
    //redirect 
    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:hello";
    }
}
