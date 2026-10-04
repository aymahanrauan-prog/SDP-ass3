package bridge;

import model.Hotel;

public interface BookingService {

    void processBooking(Hotel hotel, String guestName, int nights);
}