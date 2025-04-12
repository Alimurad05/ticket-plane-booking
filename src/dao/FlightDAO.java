package dao;

import entity.Flight;

import java.util.List;

public interface FlightDAO {
    void addFlight(Flight flight);
    void deleteFlight(int id);
    Flight getFlightById(int id);
    List<Flight>getAllFlight();
}