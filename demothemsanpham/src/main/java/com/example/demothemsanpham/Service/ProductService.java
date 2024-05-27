package com.example.demothemsanpham.Service;

import com.example.demothemsanpham.Entity.Product;
import com.example.demothemsanpham.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    //9.	Phương thức postProduct() của ProductController gọi đến phương thức postProduct() của ProductService.
    public Product postProduct(Product product) {
        return productRepository.save(product);
    }
}
