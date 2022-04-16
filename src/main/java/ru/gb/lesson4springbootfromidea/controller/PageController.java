package ru.gb.lesson4springbootfromidea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PageController {

    private ProductRepository productRepository;

    @Autowired
    public ProductRepository setProductRepository (ProductRepository productRepository) {
        this.productRepository = productRepository;
        return null;
    }


    @ResponseBody
    @GetMapping("/all")
    public String showAllProducts() {
           return productRepository.allProducts(productRepository.products);
    }

    @ResponseBody
    @RequestMapping(value = "/id/{int}", method = RequestMethod.GET)
    public String showProductById(@PathVariable(value = "int") String id) {
       return productRepository.showProductById(Integer.parseInt(id));
    }

    @RequestMapping(path = "/add", method = RequestMethod.GET)
    public String getForm(Model model, Product product){
        model.addAttribute("product", product);
        return "addProduct";
    }

    @PostMapping("/add")
    public String afterRecoveryPass(int id, String title, int cost){
        productRepository.products.add(new Product(id, title, cost));
        return "redirect:/all";
    }

}
