package ru.web.repository;

import java.util.Collection;
import java.util.HashMap;
import org.springframework.stereotype.Component;
import ru.web.model.Car;

@Component
public class CarRepo {
  private HashMap<Long, Car> repo;

  public CarRepo() {
    HashMap<Long, Car> map = new HashMap<>();
    map.put(1l, Car.builder()
        .id(1L)
        .name("Audi")
        .type("E3")
        .value(3)
        .build());
    map.put(2l, Car.builder()
        .id(2L)
        .name("Lada")
        .type("Vesta")
        .value(10)
        .build());
    map.put(3l, Car.builder()
        .id(3L)
        .name("Mercedes")
        .type("GLC")
        .value(5)
        .build());
    this.repo = map;
  }

  public Car getCarById(Long id) {
    return repo.get(id);
  }

  public Collection<Car> getAllCar() {
    return repo.values();
  }

  public void saveCar(Car car) {
    repo.put(car.getId(), car);
  }

  public void deleteCar(Long id) {
    repo.remove(id);
  }
}
