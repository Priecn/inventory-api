package com.pos.repository;

import com.pos.model.Invoice;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long> {

    List<Invoice> findByInvoiceDateTimeAfterAndInvoiceDateTimeBefore(LocalDateTime start, LocalDateTime end);

}
