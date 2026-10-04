package model;

public class Hotel {
    private final String name;
    private final String city;
    private final double pricePerNight;

    public Hotel(String name, String city, double pricePerNight) {
        this.name = name;
        this.city = city;
        this.pricePerNight = pricePerNight;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    @Override
    public String toString() {
        return name + " (" + city + ") - $" + pricePerNight + " per night";
    }
}