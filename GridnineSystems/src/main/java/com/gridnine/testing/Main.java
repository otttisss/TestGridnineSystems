package com.gridnine.testing;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();
        FlightFilter departureBefore = new DepartureBefore();

        List<Flight> filteredFlight1 = departureBefore.filterFlights(flights);
        filteredFlight1.forEach(System.out::println);
    }
}
