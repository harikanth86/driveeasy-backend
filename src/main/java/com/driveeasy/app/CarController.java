
package com.driveeasy.app;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/api/cars")
@CrossOrigin
public class CarController {
 private final CarRepo repo;
 public CarController(CarRepo r){repo=r;}
 @GetMapping
 public List<Car> all(){return repo.findAll();}
}
