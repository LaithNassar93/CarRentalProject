package miu.edu.swe.CarRental.service;

import miu.edu.swe.CarRental.model.Car;
import miu.edu.swe.CarRental.model.Station;
import miu.edu.swe.CarRental.repository.CarRepository;
import miu.edu.swe.CarRental.util.MessagesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private MessagesBean messages;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private StationService stationService;

    @Autowired
    private RentalService rentalService;

    /**
     * @param station the station to be searched for
     * @return all cars that are part of the given station
     */
    public List<Car> findByStation(Station station) {
        return carRepository.findByStation(station);
    }

    /**
     * @param mileage the minimum mileage to be searched for
     * @return all cars that have a mileage greater than the given one
     */
    public List<Car> findByMileageGreaterThan(Integer mileage) {
        return carRepository.findByMileageGreaterThan(mileage);
    }


    public Car create(Car car) {
        if (car.getStation() == null) {
            throw new IllegalArgumentException(messages.get("carStationNotNull"));
        }
        if (car.getStation().getId() == null || !stationService.existsById(car.getStation().getId())) {
            throw new EntityNotFoundException(messages.get("stationNotFound"));
        }
        if (carRepository.existsById(car.getRegistrationNr())) {
            throw new EntityExistsException(messages.get("carAlreadyExists"));
        }
        return carRepository.save(car);
    }

    public void deleteById(String registrationNr) {
        Car car = carRepository.findById(registrationNr)
                .orElseThrow(() -> new EntityNotFoundException(messages.get("carNotFound")));
        if (!canDelete(car)) {
            throw new IllegalArgumentException(messages.get("carDeleteError"));
        }
        carRepository.delete(car);
    }

    public boolean canDelete(Car car) {
        return car.getStation() != null && rentalService.findByCar(car).isEmpty();
    }

}
