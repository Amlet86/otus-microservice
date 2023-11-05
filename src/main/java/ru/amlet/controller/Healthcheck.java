package ru.amlet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.amlet.dto.Response;

@RestController
public class Healthcheck {

    @GetMapping("/health")
    public Response health() {
        return Response.builder().status("OK").build();
    }
}
