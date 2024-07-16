package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false, defaultValue = "5") int n) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("It's page with cars!");

        CarServiceImp carServiceImp = new CarServiceImp();
        List<Car> carList = carServiceImp.listCars(n);

        for (Car car : carList) {
            messages.add(car.toString());
        }

        model.addAttribute("messages", messages);
        model.addAttribute("carList", carList);

        return "cars";
    }

}