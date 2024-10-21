package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAOImpl implements CarDAO{
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Mitsubishi Lancer", 2012,200));
        cars.add(new Car("Subaru Impreza",2002, 220));
        cars.add(new Car("Renault Logan",2009, 180));
        cars.add(new Car("Mazda CX-7", 2015,190));
        cars.add(new Car("Kamaz", 1983,130));
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}