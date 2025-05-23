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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createHomeCategory'");
    }

    @Override
    public List<HomeCategory> createCategories(List<HomeCategory> homeCategories) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCategories'");
    }

    @Override
    public HomeCategory updateHomeCategory(HomeCategory homeCategory, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateHomeCategory'");
    }

    @Override
    public List<HomeCategory> getAllHomeCategories() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllHomeCategories'");
    }
}
