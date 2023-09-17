package magadiflo.design.patterns.creational.builder.builders;

import magadiflo.design.patterns.creational.builder.products.Car;
import magadiflo.design.patterns.creational.builder.products.auxiliary.*;

/**
 * Los constructores concretos implementan pasos definidos en la interfaz común.
 */

public class CarBuilder implements IBuilder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car build() {
        return new Car(this.carType, this.seats, this.engine, this.transmission, this.tripComputer, this.gpsNavigator);
    }
}
