package web.service;

import web.DAO.CarDAO;
import web.DAO.CarDAOImpl;
import web.models.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    private final CarDAO carDAO;

    public CarServiceImpl() {
        carDAO = new CarDAOImpl();
    }

    @Override
    public List<Car> getCars(int count) {
        return carDAO.getCars(count);
    }
}