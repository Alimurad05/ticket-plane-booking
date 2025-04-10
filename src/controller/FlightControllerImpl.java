package controller;

import service.FlightService;
import service.FlightServiceImpl;

public class FlightControllerImpl implements FlightController{
    FlightService flightService=new FlightServiceImpl();
}
