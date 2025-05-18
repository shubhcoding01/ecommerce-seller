package com.ecomproject.service;

import com.ecomproject.model.Review;
import com.ecomproject.model.User;

import java.util.List;

public interface ReviewService {

    Review createReview(CreateReviewRequest req,
                        User user);

    List<Review> getReviewByProductId(Long productId);
}
