package com.volonter.controllers;

import com.volonter.models.Review;
import com.volonter.services.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@ComponentScan("com.volonter.services")

@Controller
@RequiredArgsConstructor
public class MainController {
    private final ReviewService reviewService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("reviews", reviewService.listReviews());
        return "home";
    }

    @PostMapping("/review/create")
    public String createReview(Review review) {
        reviewService.saveReview(review);
        return  "redirect:/#reviews";
    }
}