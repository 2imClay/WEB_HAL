package com.example.demothemsanpham.repository;

import com.example.demothemsanpham.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//10.	Phương thức postProduct() của ProductService gọi đến phương thức save() của interface ProductRepository.
//11.	Interface ProductRepository kế thừa thư viện JpaRepository thực hiện lưu sản phẩm vào cơ sở dữ liệu MySQL tên là sanpham
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
