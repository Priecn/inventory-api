package com.pos.repository;

import com.pos.model.Batch;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BatchRepository extends PagingAndSortingRepository<Batch, Long> {

    List<Batch> findByExpiryDateBefore(LocalDate date, Pageable pageable);
}
