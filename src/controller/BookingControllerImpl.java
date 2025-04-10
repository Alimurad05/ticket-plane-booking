package controller;

import service.BookingService;
import service.BookingServiceImpl;

public class BookingControllerImpl implements BookingController{
    BookingService bookingService=new BookingServiceImpl();
}
