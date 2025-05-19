package com.ecomproject.service.impl;

import com.ecomproject.model.Product;
import com.ecomproject.model.Review;
import com.ecomproject.model.User;
import com.ecomproject.request.CreateReviewRequest;
import com.ecomproject.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    @Override
    public Review createReview(CreateReviewRequest req, User user, Product product) {
        return null;
    }

    @Override
    public List<Review> getReviewByProductId(Long productId) {
        return List.of();
    }

    @Override
    public Review updateReview(Long reviewId, String reviewText, double rating, Long userId) {
        return null;
    }

    @Override
    public void deleteReview(Long reviewId, Long userId) {

    }
}
