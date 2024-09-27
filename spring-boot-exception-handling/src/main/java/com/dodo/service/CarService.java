package com.dodo.service;

import com.dodo.dto.Car;
import com.dodo.exception.EntityNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private static List<Car> carList = new ArrayList<>();

    @PostConstruct
    public void init(){
        carList.add(new Car("Car A","Brand 1"));
        carList.add(new Car("Car B","Brand 2"));
        carList.add(new Car("Car C","Brand 3"));
    }

    public Car getCar(String name){
        if (name.startsWith("M")){
            throw new IllegalArgumentException();
        }
      return carList.stream().filter(car -> car.getName().equals(name)).findFirst().orElseThrow(() -> new EntityNotFoundException(name));

    }
}
