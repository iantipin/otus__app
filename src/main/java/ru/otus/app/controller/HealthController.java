package ru.otus.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.app.dto.HealthStatusDTO;
import ru.otus.app.model.HealthStatus;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/")
    public HealthStatusDTO getHealthStatus() {
        HealthStatus healthStatus = new HealthStatus("OK");
        
        return new HealthStatusDTO(healthStatus.getStatus());
    }
}