package service;

import dao.FlightDAO;
import dao.FlightDaoImpl;

public class FlightServiceImpl implements FlightService{
    FlightDAO flightDao=new FlightDaoImpl();
}
