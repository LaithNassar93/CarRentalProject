package miu.edu.swe.CarRental.controller.rest;

import miu.edu.swe.CarRental.model.Car;
import miu.edu.swe.CarRental.model.Customer;
import miu.edu.swe.CarRental.model.Rental;
import miu.edu.swe.CarRental.service.CarService;
import miu.edu.swe.CarRental.service.CustomerService;
import miu.edu.swe.CarRental.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private CarService carService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private RentalService rentalService;

    @GetMapping("running-rentals")
    public List<Rental> findRunningRentals() {
        return rentalService.findRunningRentals();
    }

    @GetMapping("mileage-greater-than/{mileage}")
    public List<Car> findByMileageGreaterThan(@PathVariable Integer mileage) {
        return carService.findByMileageGreaterThan(mileage);
    }

    @PostMapping("create-car")
    public ResponseEntity<Car> createCar(@RequestBody @Valid Car car) {
        return ResponseEntity.created(URI.create("")).body(carService.create(car));
    }

    @PostMapping("create-customer")
    public ResponseEntity<Customer> createCustomer(@RequestBody @Valid Customer customer) {
        return ResponseEntity.created(URI.create("")).body(customerService.create(customer));
    }

    @DeleteMapping("delete-car/{registrationNr}")
    public void deleteCar(@PathVariable String registrationNr) {
        carService.deleteById(registrationNr);
    }

}
