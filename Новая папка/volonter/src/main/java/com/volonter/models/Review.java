package com.volonter.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Review {
    private Long id;
    private String name;
    private String comment;
    private String date;
}
