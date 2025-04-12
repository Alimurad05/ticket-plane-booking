package controller;

import entity.Flight;

import java.util.List;

public interface FlightController {
    void addFlight(Flight flight);
    void deleteFlight(int id);
    Flight getFlightById(int id);
    List<Flight> getAllFlights();
    List<Flight> getAvailableFlights();
}
