package com.spring.lesson3NotSimpleValue;

public class iPad implements Device {
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModelDevice() {
        return model;
    }
}
