package ua.tqs.QualidadeAr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/home")
    public String all(Model model){
        return "index.html";
    }
}