package com.codewithvictor.store;
import org.springframework.web.bind.annotation.

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Index() {
        return "index.html";
    }
}
