package dao;

import entity.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightDaoImpl implements FlightDAO {
    private List<Flight>flights=new ArrayList<>();

    @Override
    public void addFlight(Flight flight) {
        flights.add(flight);
        System.out.println("New flight added: " + flight);

    }

    @Override
    public void deleteFlight(int id) {
        flights.removeIf(f->f.getId()==id);
        System.out.println("Flight where id=: "+ id +"deleted");

    }

    @Override
    public Flight getFlightById(int id) {
        return flights.stream()
                .filter(f->f.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public List<Flight> getAllFlight() {
        return new ArrayList<>(flights);
    }
}
