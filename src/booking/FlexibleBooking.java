package booking;

import bridge.BookingService;
import model.Hotel;

public class FlexibleBooking extends Booking {

    public FlexibleBooking(BookingService bookingService) {
        super(bookingService);
    }

    @Override
    public void book(Hotel hotel, String guestName, int nights) {
        System.out.println("Flexible booking selected.");

        bookingService.processBooking(
                hotel,
                guestName,
                nights
        );

        System.out.println(
                "Cancellation is allowed according to flexible policy."
        );
    }
}