package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    private List<Car> carList = new ArrayList<>();

    public CarService() {
        carList.add(new Car("BMW", "E46", 2003));
        carList.add(new Car("Lexus", "RX450h", 2008));
        carList.add(new Car("Mercedes", "R170", 1996));
        carList.add(new Car("Peugeot", "308", 2008));
        carList.add(new Car("Chrysler", "300C", 2010));
    }

    public List<Car> getAllCars() {
        return carList;
    }

    public List<Car> getSomeCars(int numOfCars) {
        if (numOfCars >= carList.size()) {
            return carList;
        }
        List<Car> newCarList = new ArrayList<>();
        for (int i = 0; i < numOfCars; i++) {
            newCarList.add(carList.get(i));
        }
        return newCarList;
    }
}
