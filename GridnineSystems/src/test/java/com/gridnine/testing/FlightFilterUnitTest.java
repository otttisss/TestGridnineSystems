package com.gridnine.testing;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFilterUnitTest {
    @Test
    void testDepartureBefore() {
        FlightFilter flightFilter = new DepartureBefore();
        List<Flight> flights = flightFilter.filterFlights(FlightBuilder.createFlights());
        assertEquals(5, flights.size());
    }

    @Test
    void testArrivalBeforeDeparture() {
        FlightFilter flightFilter = new ArrivalBeforeDeparture();
        List<Flight> flights = flightFilter.filterFlights(FlightBuilder.createFlights());
        assertEquals(5, flights.size());
    }

    @Test
    void testOverTwoHoursOnEarth() {
        FlightFilter flightFilter = new OverTwoHoursOnEarth();
        List<Flight> flights = flightFilter.filterFlights(FlightBuilder.createFlights());
        assertEquals(4, flights.size());
    }
}
