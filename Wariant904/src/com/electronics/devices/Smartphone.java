package com.electronics.devices;

public record Smartphone(String model, int batteryCapacity,String operatingSystem) {
    public Smartphone() {
        this("Default", 10, "Default_System");
    }
}
