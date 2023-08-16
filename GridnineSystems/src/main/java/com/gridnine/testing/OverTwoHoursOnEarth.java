package com.gridnine.testing;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Этот класс реализует фильтр, который исключает из списка перелётов те,
// у которых общее время, проведённое на земле между сегментами, превышает два часа.

public class OverTwoHoursOnEarth implements FlightFilter {
    @Override
    public List<Flight> filterFlights(List<Flight> flights) {
        List<Flight> filteredFlights = new ArrayList<>();

        for (Flight flight : flights) {
            boolean isValid = true;
            List<Segment> segments = flight.getSegments();

            for (int i = 0; i < segments.size() - 1; i++) {
                LocalDateTime currentSegmentArrival = segments.get(i).getArrivalDate();
                LocalDateTime nextSegmentDeparture = segments.get(i + 1).getDepartureDate();

                if (Duration.between(currentSegmentArrival, nextSegmentDeparture).toHours() <= 2) {
                    isValid = false;
                    break;
                }
            }
            if (isValid)
                filteredFlights.add(flight);
        }
        return filteredFlights;
    }
}
