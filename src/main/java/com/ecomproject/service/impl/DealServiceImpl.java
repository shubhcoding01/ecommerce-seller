package com.ecomproject.service.impl;

import com.ecomproject.model.Deal;
import com.ecomproject.model.HomeCategory;
import com.ecomproject.repository.DealRepository;
import com.ecomproject.repository.HomeCategoryRepository;
import com.ecomproject.service.DealService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DealServiceImpl implements DealService {

    private final DealRepository dealRepository;
    private final HomeCategoryRepository homeCategoryRepository;

    @Override
    public List<Deal> getDeals() {
        return dealRepository.findAll();
    }

    @Override
    public Deal createDeal(Deal deal) {

        HomeCategory homeCategory = homeCategoryRepository.findById(deal.getId()).orElse(null);

        Deal newDeal  = dealRepository.save(deal);
        return null;
    }

    @Override
    public Deal updateDeal(Deal deal) {
        return null;
    }

    @Override
    public void deleteDeal(Deal deal) {

    }
}
