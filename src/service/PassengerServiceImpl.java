package service;

import dao.PassengerDAO;
import dao.PassengerDaoImpl;

public class PassengerServiceImpl implements PassengerService{
    PassengerDAO passengerDao=new PassengerDaoImpl();
}
