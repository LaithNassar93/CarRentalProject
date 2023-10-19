package miu.edu.swe.CarRental.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import miu.edu.swe.CarRental.model.Station;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class SelectedStationBean {
    @NotNull
    private Station station;
}
