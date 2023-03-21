package com.spring.lesson3NotSimpleValue;

public class CarBMW implements Car {
    private String model;
    private int age;
    private Device device;



    public CarBMW() {
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }


    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }                                                                      //используется в lesson3context3

    public void setModel(String model) {
        this.model = model;
    }                                                                        //используется в lesson3context3

    public void setAge(int age) {
        this.age = age;
    }
}
