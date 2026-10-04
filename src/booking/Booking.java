package booking;

import bridge.BookingService;
import model.Hotel;

public abstract class Booking {

    protected BookingService bookingService;

    public Booking(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public abstract void book(Hotel hotel, String guestName, int nights);
}