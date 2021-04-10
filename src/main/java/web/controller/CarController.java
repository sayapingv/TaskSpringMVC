package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarController {

    @Autowired
    private CarDao carDao;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", required = false) Integer count, Model model) {
        if (count == null) {
            count = 5;
        }
        model.addAttribute("cars", carDao.getCars(count));

        return "cars";
    }
}
