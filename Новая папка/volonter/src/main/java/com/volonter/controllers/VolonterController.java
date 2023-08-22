package com.volonter.controllers;

import com.volonter.models.Application;
import com.volonter.services.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@ComponentScan("com.volonter.services")

@Controller
@RequiredArgsConstructor
public class VolonterController {
    private final ApplicationService applicationService;

    @GetMapping("/info/{id}")
    public String info(@PathVariable Long id, Model model){
        model.addAttribute("applications", applicationService.getApplicationById(id));
        return "info";
    }

    @GetMapping("/volonter")
    public String volonter(Model model) {
        model.addAttribute("applications", applicationService.listApplications());
        model.addAttribute("applications2", applicationService.listApplications2());
        return "volonter";
    }

    @PostMapping("/application/create")
    public String createApplication(Application application) {
        applicationService.saveApplication(application);
        return  "redirect:/";
    }



}


