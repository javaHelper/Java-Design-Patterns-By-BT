package com.example.singleton;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
        System.out.println(instance.getName());

        instance.setName("Prateek");
        System.out.println(instance.getName());
    }
}