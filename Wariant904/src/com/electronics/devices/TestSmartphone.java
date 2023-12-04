package com.electronics.devices;

public class TestSmartphone {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Model", 5, "System");
        Smartphone s2 = new Smartphone();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.model());
        System.out.println(s2.batteryCapacity());
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
