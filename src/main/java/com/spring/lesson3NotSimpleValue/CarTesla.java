package com.spring.lesson3NotSimpleValue;

public class CarTesla implements Car {
        private String model;
        private int age;
    private Device device;

        public CarTesla() {
        }

        public String getModel() {
            return model;
        }

        public int getAge() {
            return age;
        }

    @Override
    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setModel(String model) {
            this.model = model;
        }

        public void setAge(int age) {
            this.age = age;
        }
}
