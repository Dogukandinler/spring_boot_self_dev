package com.dodo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {

    private String name;
    private String brand;

    public Car() {
    }

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
}
