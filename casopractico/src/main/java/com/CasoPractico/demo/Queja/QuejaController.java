package com.CasoPractico.demo.Queja;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quejas")
public class QuejaController {
    @Autowired
    private QuejaService quejaService;

    @GetMapping
    public String listarQuejas(Model model) {
        model.addAttribute("quejas", quejaService.listarQuejas());
        return "quejas";
    }
}