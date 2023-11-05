package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceIpm implements CarService {
    private final CarDao carDao;

    public CarServiceIpm(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getListCars(Integer count) {
        return carDao.getListCars(count);
    }
}
