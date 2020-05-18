package emrys.spring.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexControllers {

    @GetMapping("/")
    public String index(){
        return ("<h1> Welcome ALL ! </h1>");
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

}


