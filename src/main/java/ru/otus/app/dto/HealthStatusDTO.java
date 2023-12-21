package ru.otus.app.dto;

public class HealthStatusDTO {
    private String status;

    public HealthStatusDTO(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}