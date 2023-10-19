package miu.edu.swe.CarRental.service;

import miu.edu.swe.CarRental.model.Station;
import miu.edu.swe.CarRental.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    @Autowired
    private StationRepository stationRepository;

    public List<Station> findAll() {
        return stationRepository.findAll();
    }


    public boolean existsById(Integer id) {
        return stationRepository.existsById(id);
    }


}
