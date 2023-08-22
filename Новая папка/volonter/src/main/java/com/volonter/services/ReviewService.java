package com.volonter.services;
import com.volonter.models.Review;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewService {
    private List<Review> reviews = new ArrayList<>();
    private long ID = 0;

    {
        reviews.add(new Review(++ID,"Кирилл","Огромное спасибо за адресную помощь","13 июля 2023 года"));
        reviews.add(new Review(++ID,"Евгений","Огромное спасибо за гуманитарную помощь","14 июля 2023 года"));
        reviews.add(new Review(++ID,"Жанна","Огромное спасибо за психологическую помощь","15 июля 2023 года"));
    }

    public List<Review> listReviews() {return reviews;}
    public void saveReview(Review review) {
        review.setId(++ID);
        reviews.add(review);
    }

    public void deleteReview(Long id) {
        reviews.removeIf(review -> review.getId().equals(id));
    }
}
