package com.example.demothemsanpham.Controller;

import com.example.demothemsanpham.Entity.Product;
import com.example.demothemsanpham.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProductController {
    private final ProductService productService;
    @PostMapping("/product")
    //8.	AddProductPage gọi đến phương thức postProduct() của ProductController.
    public Product postProduct(@RequestBody Product product) {
return productService.postProduct(product);
    }
}
