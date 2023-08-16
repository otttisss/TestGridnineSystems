package com.gridnine.testing;

import java.util.List;
import java.util.stream.Collectors;

// Этот класс реализует фильтр, который исключает из списка перелётов все те,
// у которых дата прилёта раньше даты вылета хотя бы в одном сегменте.

public class ArrivalBeforeDeparture implements FlightFilter {
    @Override
    public List<Flight> filterFlights(List<Flight> flights) {
        return flights.stream().filter(flight -> flight.getSegments().stream()
                .noneMatch(segment -> segment.getArrivalDate().isBefore(segment.getDepartureDate())))
                .collect(Collectors.toList());
    }
}
