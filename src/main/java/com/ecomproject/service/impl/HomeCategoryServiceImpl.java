package com.ecomproject.service.impl;

import java.util.List;

import com.ecomproject.model.HomeCategory;
import com.ecomproject.service.HomeCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HomeCategoryServiceImpl implements HomeCategoryService{


    @Override
    public HomeCategory createHomeCategory(HomeCategory homeCategory) {
        return null;
    }

    @Override
    public List<HomeCategory> createCategories(List<HomeCategory> homeCategories) {
        return List.of();
    }

    @Override
    public HomeCategory updateHomeCategory(HomeCategory homeCategory, Long id) {
        return null;
    }

    @Override
    public List<HomeCategory> getAllHomeCategories() {
        return List.of();
    }
}
