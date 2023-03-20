package ru.web.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.web.model.Car;
import ru.web.repository.CarRepo;


@Controller
public class HtmlController {

  private final CarRepo carRepo;

  public HtmlController(CarRepo carRepo) {
    this.carRepo = carRepo;
  }

  @RequestMapping(value = "/cars", method = RequestMethod.GET)
  public String init(Model model) {
    List<Car> carList = carRepo.getAllCar();
    model.addAttribute("carList", carList);
    return "index";
  }

//  @RequestMapping(value = "/helloworld")
//  public String handler(Model model) {
//    HelloWorld helloWorld = new HelloWorld();
//    helloWorld.setMessage("Hello World Пример первого MVC приложения");
//    helloWorld.setDateTime(LocalDateTime.now().toString());
//    model.addAttribute("helloWorld", helloWorld);
//    return "helloworld";
//  }
//
//  @RequestMapping("/car")
//  public String carService(Model model) {
//    model.addAttribute(carRepo.getAllCar());
//    return "carList";
//  }
//
//  @RequestMapping(value = "/car", method = RequestMethod.POST)
//  public String saveCar(Car car, Model model) {
//    System.out.println(car);
//    carRepo.saveCar(car);
//    model.addAttribute("newCar", car);
//    model.addAttribute("carList", carRepo.getAllCar());
//    return "carInfo";
//  }
//
//  @RequestMapping(value = "/car/{id}", method = RequestMethod.GET)
//  public String deleteCar(@PathVariable("id") Long id, Model model) {
//    carRepo.deleteCar(id);
//    model.addAttribute(carRepo.getAllCar());
//    return "carList";
//  }
}