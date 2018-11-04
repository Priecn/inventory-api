package com.pos.service;

import com.pos.model.Product;
import com.pos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> listAllProduct() {
        List<Product> productList = new ArrayList<>();
        productRepository.findAll().forEach(p -> productList.add(p));
        return productList;
    }

    public List<Product> findProductPerPage(int offset, int pageSize) {
        Pageable pageable = PageRequest.of(offset, pageSize);
        List<Product> productList = new ArrayList<>();
        productRepository.findAll(pageable).forEach(p -> productList.add(p));
        return productList;
    }

    public List<Product> sortProductBasedOfGivenPrameter(String param, String order, int offset, int pageSize) {
        List<Product> productList = new ArrayList<>();

        if(order.equals("asc")) {
            Pageable pageable = PageRequest.of(offset, pageSize, Sort.by(param).ascending());
            productRepository.findAll(pageable).forEach(p -> productList.add(p));
        } else {
            Pageable pageable = PageRequest.of(offset, pageSize, Sort.by(param).descending());
            productRepository.findAll(pageable).forEach(p -> productList.add(p));
        }
        return productList;
    }

    public List<Product> getExpiredProduct(int offset, int pageSize) {
        List<Product> productList = new ArrayList<>();
        Pageable pageable = PageRequest.of(offset, pageSize);
        productRepository.findByExpiryDateBefore(LocalDate.now(), pageable).forEach(p -> productList.add(p));
        return productList;
    }

    public List<Product> searchProductThatStartsWithGivenCharacter(int offset, int pageSize, String c) {
        List<Product> productList = new ArrayList<>();
        Pageable pageable = PageRequest.of(offset, pageSize);
        productRepository.findByNameIgnoreCaseStartsWith(c, pageable).forEach(p -> productList.add(p));
        return productList;
    }

    public List<Product> searchProductWithSearchString(int offset, int pageSize, String search) {
        List<Product> productList = new ArrayList<>();
        Pageable pageable = PageRequest.of(offset, pageSize);
        productRepository.findByNameIgnoreCaseContaining(search, pageable).forEach(p -> productList.add(p));
        return productList;
    }
}
