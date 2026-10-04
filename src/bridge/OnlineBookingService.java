package bridge;

import model.Hotel;

public class OnlineBookingService implements BookingService {

    @Override
    public void processBooking(Hotel hotel, String guestName, int nights) {
        double totalPrice = hotel.getPricePerNight() * nights;

        System.out.println("=== Online Booking ===");
        System.out.println("Guest: " + guestName);
        System.out.println("Hotel: " + hotel.getName());
        System.out.println("City: " + hotel.getCity());
        System.out.println("Nights: " + nights);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Booking confirmed online.");
    }
}