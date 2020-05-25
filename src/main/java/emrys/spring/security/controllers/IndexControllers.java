package emrys.spring.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexControllers {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/users")
    public String user()
    {
        return ("<h1> Welcome User </h1>");
    }

    @GetMapping("/admin")
    public String admin()
    {
        return ("<h1> Welcome Admin !</h1>");
    }


    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

}


