package com.example.formid.Controllers;

import com.example.formid.entity.Product;
import com.example.formid.repository.ProductRepository;
import com.example.formid.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller // Аннотации обязательны для упоминания
public class MainController {

    private final ProductService productService;
    private final ProductRepository productRepository;

    @Autowired
    public MainController(ProductService productService, ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }

    @GetMapping("/home")
    public String home(Model model) {
//        model.addAttribute("title", "Home Page");
        return "home";

    }

    @GetMapping("/basket")
    public String basket(Model model) {
//        List<Product> products = productRepository.findAll();
        model.addAttribute("products", productRepository.findAll());
        return "basket";
    }




//    @GetMapping("/films")
//    public String findAll(Model model){
//        List<Product> films = productService.findAll();
//        model.addAttribute("films", films);
//        return "film-list";
//    }

//    @GetMapping("/film-add")
//    public String createFilmForm(Product product){
//        return "film-add";
//    }

    @PostMapping("/product-add")
    public String createProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/basket";
    }

//    @GetMapping("film-delete/{id}")
//    public String deleteFilm(@PathVariable("id") Long id){
//        productService.deleteById(id);
//        return "redirect:/films";
//    }

//    @GetMapping("/film/{id}")
//    public String filmInfo(@PathVariable(value = "id") Long id, Model model) {
//        if(!filmsRepository.existsById(id)) {
//            return"redirect:/films";
//        }
//        Optional<Films> film = filmsRepository.findById(id);
//        ArrayList<Films> res = new ArrayList<>();
//        film.ifPresent(res::add);
//        model.addAttribute("film", res);
//        return"films-description";
//    }

//    @GetMapping("/about")
//    public String about() {
//        return "about";
//    }
}

