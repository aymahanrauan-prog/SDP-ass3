import booking.Booking;
import booking.FlexibleBooking;
import booking.StandardBooking;
import bridge.BookingService;
import bridge.OfflineBookingService;
import bridge.OnlineBookingService;
import model.Hotel;

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel(
                "Grand Astana Hotel",
                "Astana",
                80.0
        );

        // Online implementation
        BookingService onlineService =
                new OnlineBookingService();

        Booking standardOnlineBooking =
                new StandardBooking(onlineService);

        standardOnlineBooking.book(
                hotel,
                "Magzhan",
                3
        );

        System.out.println();

        // Offline implementation
        BookingService offlineService =
                new OfflineBookingService();

        Booking standardOfflineBooking =
                new StandardBooking(offlineService);

        standardOfflineBooking.book(
                hotel,
                "Magzhan",
                3
        );

        System.out.println();

        // Another abstraction + online implementation
        Booking flexibleOnlineBooking =
                new FlexibleBooking(onlineService);

        flexibleOnlineBooking.book(
                hotel,
                "Magzhan",
                5
        );
    }
}