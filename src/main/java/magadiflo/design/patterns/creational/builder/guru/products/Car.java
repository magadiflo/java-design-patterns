package magadiflo.design.patterns.creational.builder.guru.products;

import magadiflo.design.patterns.creational.builder.guru.products.auxiliary.*;

/**
 * Car es una clase Producto
 */
public class Car {
    private final CarType carType;
    private final int seats;//asientos
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;//combustible

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
               GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("carType=").append(carType);
        sb.append(", seats=").append(seats);
        sb.append(", engine=").append(engine);
        sb.append(", transmission=").append(transmission);
        sb.append(", tripComputer=").append(tripComputer);
        sb.append(", gpsNavigator=").append(gpsNavigator);
        sb.append(", fuel=").append(fuel);
        sb.append('}');
        return sb.toString();
    }
}
