package com.pos.controller;

import com.pos.model.Product;
import com.pos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> findAll() {
        return productService.listAllProduct();
    }

    @GetMapping("/page")
    public List<Product> getProductPerPage(@RequestParam(defaultValue = "0") int offset,
                                           @RequestParam(defaultValue = "10") int size){
        return productService.findProductPerPage(offset, size);
    }

    @GetMapping("/sort")
    public List<Product> getSortedListOfProduct(@RequestParam(defaultValue = "0") int offset,
                                                @RequestParam(defaultValue = "10") int size,
                                                @RequestParam String param,
                                                @RequestParam(defaultValue = "asc") String order) {
        return productService.sortProductBasedOfGivenPrameter(param, order, offset, size);
    }

    @GetMapping("/expired")
    public List<Product> getExpiredProduct(@RequestParam(defaultValue = "0") int offset,
                                           @RequestParam(defaultValue = "10") int size) {
        return productService.getExpiredProduct(offset, size);
    }

    @GetMapping("/starting")
    public List<Product> getProductStartingWithGivenCharacter(@RequestParam(defaultValue = "0") int offset,
                                                              @RequestParam(defaultValue = "10") int size,
                                                              @RequestParam String startsWith) {
        return productService.searchProductThatStartsWithGivenCharacter(offset, size, startsWith);
    }

    @GetMapping("/search")
    public List<Product> getProductContaingGivenSearchString(@RequestParam(defaultValue = "0") int offset,
                                                             @RequestParam(defaultValue = "10") int size,
                                                             @RequestParam String pattern) {
        return productService.searchProductWithSearchString(offset, size, pattern);
    }
}
