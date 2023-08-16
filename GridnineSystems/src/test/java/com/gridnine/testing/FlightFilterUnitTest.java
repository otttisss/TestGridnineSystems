package com.gridnine.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFilterUnitTest {
    private List<Flight> flights;
    @BeforeEach
    void setUp() {
        flights = FlightBuilder.createFlights();
    }

    @Test
    void testDepartureBefore() {
        FlightFilter flightFilter = new DepartureBefore();
        List<Flight> filterFlights = flightFilter.filterFlights(flights);
        assertEquals(5, filterFlights.size());
    }

    @Test
    void testArrivalBeforeDeparture() {
        FlightFilter flightFilter = new ArrivalBeforeDeparture();
        List<Flight> filterFlights = flightFilter.filterFlights(flights);
        assertEquals(5, filterFlights.size());
    }

    @Test
    void testOverTwoHoursOnEarth() {
        FlightFilter flightFilter = new OverTwoHoursOnEarth();
        List<Flight> filterFlights = flightFilter.filterFlights(flights);
        assertEquals(4, filterFlights.size());
    }
}
