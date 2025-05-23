package com.ecomproject.service.impl;

import com.ecomproject.domain.HomeCategorySection;
import com.ecomproject.model.Home;
import com.ecomproject.model.HomeCategory;
import com.ecomproject.service.HomeService;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService{

    @Override
    public Home createHomePageData(List<HomeCategory> allCategories) {

        List<HomeCategory> gridCategories = allCategories.stream()
                .filter(homeCategory ->
                        homeCategory.getSection() == HomeCategorySection.GRID)
                .collect(Collectors.toList());

        

        return null;
    }
}
