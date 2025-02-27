package com.CasoPractico.demo.Categoria;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public String listarCategorias(Model model) {
        model.addAttribute("categorias", categoriaService.listarCategorias());
        return "categorias";
    }
}
