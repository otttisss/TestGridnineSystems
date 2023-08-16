package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        FlightFilter departureBefore = new DepartureBefore();
        List<Flight> filteredDeparture = departureBefore.filterFlights(flights);
        System.out.println("Flights departure before current time: ");
        filteredDeparture.forEach(System.out::println);

        FlightFilter arrivalBefore = new ArrivalBeforeDeparture();
        List<Flight> filteredArrival = arrivalBefore.filterFlights(flights);
        System.out.println("Flights arrival before current time: ");
        filteredArrival.forEach(System.out::println);

        FlightFilter overTwoHours = new OverTwoHoursOnEarth();
        List<Flight> filteredOverTwoHours = overTwoHours.filterFlights(flights);
        System.out.println("Flights after two hours: ");
        filteredOverTwoHours.forEach(System.out::println);
    }
}
