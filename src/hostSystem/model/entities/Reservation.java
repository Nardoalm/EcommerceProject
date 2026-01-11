package hostSystem.model.entities;

import hostSystem.model.exception.DomainException;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public final class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException{
        if(!checkOut.isAfter(checkIn)){
            throw new DomainException("Check-In date must be before check-Out.");
        }
        if(checkIn.isBefore(LocalDate.now())){
            throw new DomainException("Reservations dates for update must be in the future.");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getDuration(){
        Period period = Period.between(checkIn, checkOut);
        return period.getDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws  DomainException{
        if(checkIn.isAfter(checkOut)){
            throw new DomainException("Check-In date must be before check-Out.");
        }
        if(checkOut.isBefore(LocalDate.now())){
            throw new DomainException("Reservations dates for update must be in the future.");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Room: " + getRoomNumber()
                + " check-in: " + getCheckIn()
                + " check-out: " + getCheckOut() + " "
                + getDuration() + " nights.";
    }
}
