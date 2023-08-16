package com.gridnine.testing;

import java.util.List;

// Интерфейс FlightFilter представляет абстракцию для фильтрации списка перелётов согласно определённым правилам.
public interface FlightFilter {
    List<Flight> filterFlights(List<Flight> flights);
}
