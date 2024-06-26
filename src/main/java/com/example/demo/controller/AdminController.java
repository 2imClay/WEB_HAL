package com.example.demo.controller;

import com.example.demo.entity.Exercise;
import com.example.demo.entity.Product;
import com.example.demo.service.ExerciseService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ExerciseService exerciseService;

    @GetMapping
    public String homePage(){
        return "admin/index";
    }
    @GetMapping("/product")
    public String index(Model model){
        List<Product> list = this.productService.getAllProducts();
        model.addAttribute("list", list);
        return "admin/page-list-product";
    }

    @GetMapping ("/add-product")
    public String creatProduct(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "admin/page-add-product";
    }
    @PostMapping("/add-product")
    public String save(@ModelAttribute("product") Product product){

        if (this.productService.creatProduct(product)) {
            return "redirect:/admin/product";
        } else {
            return "redirect:/admin/add-product";
        }


    }

    /*Chức năng xóa sản phẩm
    gọi phương thức xóa sản phẩm từ ProductService
    và cập nhật lại trang danh sách sản phẩm
    Khi nhấn nút xóa từ trang page-list-product
    sẽ có hàm onclick được thêm vào trong thẻ <a> để xác nhận hành động xóa sản phẩm
    sau khi nhấn có sẽ thực hiện phương thức deleteProduct và cập nhật lại trang danh sách sản phẩm
    * */
    @GetMapping("/delete-product/{productId}")
    String deleteProduct(@PathVariable("productId") String productId) {
        if (this.productService.deleteProduct(productId)) {
            return "redirect:/admin/product";
        } else {
            return "redirect:/admin/product";
        }
    }

    @GetMapping("/exercise")
    public String renderExerciseList(Model model){
        List<Exercise> list = this.exerciseService.getAllExercise();
        if (list == null || list.isEmpty()) {
            return renderEmptyExerciseList();
        }
        model.addAttribute("list", list);
        return "admin/page-list-exercise";
    }

    private String renderEmptyExerciseList() {
        return "admin/page-list-exercise";
    }

    @GetMapping("/exercise/{exerciseID}")
    String renderExerciseDetail(@PathVariable("exerciseID") String eID, Model model){
        Exercise item = this.exerciseService.getExercise(eID);
        if (item == null) {
            return renderEmptyExercise();
        }
        model.addAttribute("item", item);
        return "admin/page-exercise-detail";
    }

    private String renderEmptyExercise() {
        return "admin/page-exercise-detail-error";
    }

}
