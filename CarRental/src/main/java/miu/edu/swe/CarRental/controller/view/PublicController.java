package miu.edu.swe.CarRental.controller.view;


import miu.edu.swe.CarRental.bean.SelectedStationBean;
import miu.edu.swe.CarRental.service.CarService;
import miu.edu.swe.CarRental.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PublicController {

    @Autowired
    private CarService carService;

    @Autowired
    private StationService stationService;

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("selectedStationBean", new SelectedStationBean());
        model.addAttribute("stations", stationService.findAll());
        return "fragments/search-rentals";
    }

    @PostMapping
    public String processForm(Model model,
                              @Valid @ModelAttribute("selectedStationBean") SelectedStationBean selectedStationBean,
                              BindingResult bindingResult) {
        model.addAttribute("stations", stationService.findAll());
        model.addAttribute("cars", bindingResult.hasErrors() ? null : carService.findByStation(selectedStationBean.getStation()));
        return "fragments/search-rentals";
    }
}
