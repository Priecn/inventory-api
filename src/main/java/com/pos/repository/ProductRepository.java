package com.pos.repository;

import com.pos.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    List<Product> findByNameIgnoreCaseStartsWith(String c, Pageable pageable);
    List<Product> findByNameIgnoreCaseContaining(String search, Pageable pageable);
}
