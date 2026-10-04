package booking;

import bridge.BookingService;
import model.Hotel;

public class StandardBooking extends Booking {

    public StandardBooking(BookingService bookingService) {
        super(bookingService);
    }

    @Override
    public void book(Hotel hotel, String guestName, int nights) {
        System.out.println("Standard booking selected.");

        bookingService.processBooking(
                hotel,
                guestName,
                nights
        );
    }
}