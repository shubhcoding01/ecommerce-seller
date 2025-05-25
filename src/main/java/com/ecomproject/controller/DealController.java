package com.ecomproject.controller;

import com.ecomproject.model.Deal;
import com.ecomproject.service.DealService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/deals")
public class DealController {
    private final DealService dealService;

    public ResponseEntity<Deal> createDeals(
            @RequestBody Deal deals
    )
}
