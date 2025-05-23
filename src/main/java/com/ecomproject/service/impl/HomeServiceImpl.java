package com.ecomproject.service.impl;

import com.ecomproject.model.Home;
import com.ecomproject.model.HomeCategory;
import com.ecomproject.service.HomeService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService{

    @Override
    public Home createHomePageData(List<HomeCategory> allCategories) {
        return null;
    }
}
