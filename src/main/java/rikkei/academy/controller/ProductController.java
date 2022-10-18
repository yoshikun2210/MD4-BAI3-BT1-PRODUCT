package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rikkei.academy.model.Product;
import rikkei.academy.service.IProductService;
import rikkei.academy.service.ProductServiceIMPL;

import java.util.List;

import static rikkei.academy.service.ProductServiceIMPL.productList;

@Controller
@RequestMapping(value ={ "/","/product"})
public class ProductController {
    @Autowired
    IProductService productService;
    @GetMapping("/")
    public String index(Model model){
        List<Product> productList = productService.findAll();
        model.addAttribute("listProduct",productList);
        return "/index";
    }
}
