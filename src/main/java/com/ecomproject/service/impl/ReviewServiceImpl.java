package com.ecomproject.service.impl;

import com.ecomproject.model.Product;
import com.ecomproject.model.Review;
import com.ecomproject.model.User;
import com.ecomproject.repository.ReviewRepository;
import com.ecomproject.request.CreateReviewRequest;
import com.ecomproject.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepository reviewRepository;

    @Override
    public Review createReview(CreateReviewRequest req, User user, Product product) {

        Review review = new Review();
        review.setUser(user);
        review.setProduct(product);
        review.setReviewText(req.getReviewText());
        review.setRating(req.getReviewRating());
        review.setProductsImages(req.getProductImages());

        product.getReviews().add(review);
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getReviewByProductId(Long productId) {
        return reviewRepository.findByProductId(productId);
    }

    @Override
    public Review updateReview(Long reviewId, String reviewText, double rating, Long userId) {
        return null;
    }

    @Override
    public void deleteReview(Long reviewId, Long userId) {

    }

    @Override
    public Review getReviewById(Long reviewId) {
        return ;
    }
}
