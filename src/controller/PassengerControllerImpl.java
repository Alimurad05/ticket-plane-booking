package controller;

import service.PassengerService;
import service.PassengerServiceImpl;

public class PassengerControllerImpl implements PassengerController{
    PassengerService passengerService=new PassengerServiceImpl();
}
