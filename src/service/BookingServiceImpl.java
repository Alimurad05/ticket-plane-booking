package service;

import dao.BookingDAO;
import dao.BookingDaoImpl;

public class BookingServiceImpl implements BookingService {
    BookingDAO bookingDao=new BookingDaoImpl();
}
