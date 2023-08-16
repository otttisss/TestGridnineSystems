package com.gridnine.testing;

import java.util.List;

public class ArrivalBeforeDeparture implements FlightFilter {
    @Override
    public List<Flight> filterFlights(List<Flight> flights) {
        return flights.stream().filter(flight -> flight.getSegments().stream()
                .noneMatch(segment -> segment.getArrivalDate().isBefore(segment.getDepartureDate())))
                .toList();
    }
}
