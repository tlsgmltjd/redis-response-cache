package com.example.redisresponsecache;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApplicationController {
    private final ApplicationService applicationService;

    @PostMapping("/{field}")
    public void create(@PathVariable String field) {
        applicationService.create(field);
    }

    @GetMapping("/{id}")
    public Application find(@PathVariable Long id) {
        return applicationService.find(id);
    }
}
