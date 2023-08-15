package com.gridnine.testing;

import java.util.List;

public interface FlightFilter {
    List<Flight> filterFlights(List<Flight> flights);
}
