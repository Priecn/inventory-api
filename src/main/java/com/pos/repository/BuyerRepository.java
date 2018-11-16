package com.pos.repository;

import com.pos.model.Buyer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends PagingAndSortingRepository<Buyer, Long> {

    Buyer findBuyerByMobileNumber(int mobileNUmber);
}
