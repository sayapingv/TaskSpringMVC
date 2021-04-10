package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("Brand1", "Model1", 1));
        list.add(new Car("Brand2", "Model2", 2));
        list.add(new Car("Brand3", "Model3", 3));
        list.add(new Car("Brand4", "Model4", 4));
        list.add(new Car("Brand5", "Model5", 5));
    }

    public List<Car> getCars(int count) {
        if (count < 5) {
            List<Car> cars = new ArrayList<>();
            for (int i = 0; i < count && i < 5; i++) {
                cars.add(list.get(i));
            }
            return cars;
        } else {
            return list;
        }
    }
}
