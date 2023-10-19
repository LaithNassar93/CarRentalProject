package miu.edu.swe.CarRental.repository;

import miu.edu.swe.CarRental.model.Car;
import miu.edu.swe.CarRental.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {
    List<Car> findByStation(Station station);

    List<Car> findByMileageGreaterThan(Integer mileage);
}
