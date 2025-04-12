package controller;

import entity.Flight;
import service.FlightService;
import java.util.List;

public class FlightControllerImpl implements FlightController{
    FlightService flightService;

    public FlightControllerImpl(FlightService flightService) {
        this.flightService = flightService;
    }

    @Override
    public void addFlight(Flight flight) {
        flightService.addFlight(flight);
        System.out.println("New flight added; ");

    }

    @Override
    public void deleteFlight(int id) {
        flightService.deleteFlight(id);

    }

    @Override
    public Flight getFlightById(int id) {
        return flightService.getFlightById(id);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @Override
    public List<Flight> getAvailableFlights() {
        return flightService.getAvailableFlights();
    }
}
