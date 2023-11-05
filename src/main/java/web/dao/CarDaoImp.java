package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Repository
public class CarDaoImp implements CarDao {
    private final List<Car> listCars;

    {
        listCars = new ArrayList<>();

        listCars.add(new Car(1, "Chiron Super Sport", 490));
        listCars.add(new Car(2, "Aventador SVJ", 350));
        listCars.add(new Car(3, "Daytona SP3", 350));
        listCars.add(new Car(4, "F1 GTR", 349));
        listCars.add(new Car(5, "MC20", 325));
    }

    @Override
    public List<Car> getListCars(Integer count) {
        if (Objects.isNull(count) || count >= 5) {
            return listCars;
        }
        if (count <= 0) {
            return null;
        }
        return listCars.stream().limit(count).collect(Collectors.toList());
    }
}
