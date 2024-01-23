package com.kgisl.sbdevtools;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/car")
class CarController {

  record Car(Long id, String modelname) {}

  interface carrepository extends ListCrudRepository<Car, Long> {}
  @GetMapping
  List<Car> getallcars() {
    List<Car> cars = Arrays.asList(new Car(1L, "AUDI"), new Car(2L, "bmw"), new Car(3L, "rolls"));
    return cars;
  }
}
