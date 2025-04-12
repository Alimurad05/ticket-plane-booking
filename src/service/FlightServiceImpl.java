package service;

import dao.FlightDAO;
import entity.Flight;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FlightServiceImpl implements FlightService{
    private final FlightDAO flightDAO;

    public FlightServiceImpl(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    @Override
    public void addFlight(Flight flight) {
        flightDAO.addFlight(flight);

    }

    @Override
    public void deleteFlight(int id) {
        flightDAO.deleteFlight(id);

    }

    @Override
    public Flight getFlightById(int id) {
        return flightDAO.getFlightById(id);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightDAO.getAllFlight();
    }

    @Override
    public List<Flight> getAvailableFlights() {
        return flightDAO.getAllFlight()
                .stream()
                .filter(f->f.getDate()
                .isAfter(LocalDateTime.now()))
                .filter(f->f.getAvailableSeats()>0)
                .collect(Collectors.toList());
    }


}
