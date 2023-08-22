package com.volonter.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Application {
    private Long id;
    private String name;
    private String number;
    private String comment;
    private String date;
    private String comment_volonter;
    private String type;
    private String status;

}
