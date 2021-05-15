package web.service;

import web.model.Car;
import web.controller.CarsController;
import web.config.WebConfig;
import java.util.ArrayList;
import java.util.List;

public class CarService{

    public static List<Car> getCarsFromList(int count) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("BMW", "2.5i", "525i"));
        carsList.add(new Car("Mercedes", "2.5", "e"));
        carsList.add(new Car("Skoda", "1.4 turbo", "Rapid"));
        carsList.add(new Car("Tesla", "electricX", "Model-X"));
        carsList.add(new Car("Lexus", "3.5Hybrid", "IS"));
        return carsList.subList(0, count);
    }
}
