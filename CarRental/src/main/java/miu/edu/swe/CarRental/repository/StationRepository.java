package miu.edu.swe.CarRental.repository;

import miu.edu.swe.CarRental.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {
}
