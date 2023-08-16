package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

// Этот класс реализует фильтр, который исключает из списка перелётов все те,
// у которых дата вылета раньше текущего момента времени.

public class DepartureBefore implements FlightFilter {
    @Override
    public List<Flight> filterFlights(List<Flight> flights) {
        LocalDateTime currentTime = LocalDateTime.now();

        return flights.stream().filter(flight -> flight.getSegments().stream()
                .allMatch(segment -> segment.getDepartureDate().isAfter(currentTime)))
                .collect(Collectors.toList());
    }
}
