package magadiflo.design.patterns.creational.FactoryMethod.chatgpt;

import magadiflo.design.patterns.creational.FactoryMethod.chatgpt.creator.CarFactory;
import magadiflo.design.patterns.creational.FactoryMethod.chatgpt.creator.IVehicleFactory;
import magadiflo.design.patterns.creational.FactoryMethod.chatgpt.creator.MotorcycleFactory;
import magadiflo.design.patterns.creational.FactoryMethod.chatgpt.product.IVehicle;

public class Main {
    public static void main(String[] args) {
        // Crear una fábrica de autos
        IVehicleFactory vehicleFactory = new CarFactory();
        IVehicle car = vehicleFactory.createVehicle();
        car.speedUp();
        car.curb();

        // Crear una fábrica de motocicletas
        IVehicleFactory motorcycleFactory = new MotorcycleFactory();
        IVehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.speedUp();
        motorcycle.curb();
    }
}
