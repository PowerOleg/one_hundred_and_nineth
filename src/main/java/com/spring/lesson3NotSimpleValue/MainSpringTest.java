package com.spring.lesson3NotSimpleValue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringTest {
    public static void main(String[] args) {
        //задача засетать в CarBMW доп поле котрое не примитив, а объект Device device, в частности данные из iPad;

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/lesson3context3.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car.getModel());
        System.out.println(car.getDevice().getModelDevice());
    }
}
