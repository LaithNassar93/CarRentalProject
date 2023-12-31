package miu.edu.swe.CarRental.repository;

import miu.edu.swe.CarRental.model.Car;
import miu.edu.swe.CarRental.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Integer> {

    @Query("SELECT r FROM Rental r WHERE r.km IS NULL AND r.returnDate IS NULL AND r.returnStation IS NULL")
    List<Rental> findRunningRentals();

    List<Rental> findByCar(Car car);

}
