package com.gridnine.testing.filtration;

import com.gridnine.testing.model.Flight;

import java.util.List;

public class ArrivalBeforeDeparture implements FlightFilter {
    @Override
    public List<Flight> filterFlights(List<Flight> flights) {
        return null;
    }
}
