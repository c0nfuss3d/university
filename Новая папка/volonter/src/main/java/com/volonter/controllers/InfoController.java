package com.volonter.controllers;

import com.volonter.services.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@ComponentScan("com.volonter.services")

@Controller
@RequiredArgsConstructor
public class InfoController {
    private final ApplicationService applicationService;

    @GetMapping("/info")
    public String application(Model model) {
        model.addAttribute("applications", applicationService.listApplications());
        return "info";
    }

}
