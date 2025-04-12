package service;

import dao.FlightDAO;
import entity.Flight;

import java.util.List;

public interface FlightService {
    void addFlight(Flight flight);
    void deleteFlight(int id);
    Flight getFlightById(int id);
    List<Flight>getAllFlights();
    List<Flight> getAvailableFlights();
}
