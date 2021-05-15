package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) String string, ModelMap model) {

        model.addAttribute("cars_list", CarService.getCarsFromList(Integer.parseInt(string)));
        return "cars";
    }
}
