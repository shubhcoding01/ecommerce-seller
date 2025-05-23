package com.ecomproject.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecomproject.model.Home;

import lombok.RequiredArgsConstructor;
import okhttp3.Response;

@RestController
@RequiredArgsConstructor
public class HomeCategoryController {
    private final HomeCategoryService homeCategoryService;
    private final HomeCategoryRepository homeCategoryRepository;
    public ResponseEntity<Home> createHomeCategories(
        @RequestBody List<HomeCategory> homeCategories) {
            List<HomeCategory> categories = homeCategoryService.createCategories(homeCategories);
    );
    }
}
