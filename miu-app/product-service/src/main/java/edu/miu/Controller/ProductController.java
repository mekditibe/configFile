package edu.miu.Controller;

import edu.miu.Entity.Product;
import edu.miu.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductServiceImpl userService;

    @GetMapping
    public List<Product> getAllProduct(){
        return userService.findAllProduct();
    }



}
