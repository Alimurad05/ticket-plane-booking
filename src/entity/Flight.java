package entity;

import java.time.LocalDateTime;

public class Flight {
    private long id;
    private String departureCity;
    private String destinationCity;
    private LocalDateTime date;
    private int availableSeats;
    private int totalSeats;

    public Flight(long id, String departureCity, String destinationCity, LocalDateTime date, int availableSeats, int totalSeats) {
        this.id = id;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.date = date;
        this.availableSeats = availableSeats;
        this.totalSeats = totalSeats;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departureCity='" + departureCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", date=" + date +
                ", availableSeats=" + availableSeats +
                ", totalSeats=" + totalSeats +
                '}';
    }
}
