package com.ecomproject.service;

import com.ecomproject.model.Review;

import java.util.List;

public interface ReviewService {

    Review createReview(Review review);

    List<Review> getReviewByProductId(Long productId);
}
