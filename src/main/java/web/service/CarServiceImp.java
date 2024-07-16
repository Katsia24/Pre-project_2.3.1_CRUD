package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> listCars(int n) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Mercedes", 1998, "Germany"));
        cars.add(new Car("Audi", 2000, "Germany"));
        cars.add(new Car("Ford", 2005, "USA"));
        cars.add(new Car("Xiaomi SU7", 2024, "China"));
        cars.add(new Car("Renault", 2020, "France"));

        while (n < cars.size()) {
            cars.remove(cars.size() - 1);
        }

        return cars;
    }
}
