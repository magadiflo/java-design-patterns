package magadiflo.design.patterns.creational.FactoryMethod.chatgpt.creator;

import magadiflo.design.patterns.creational.FactoryMethod.chatgpt.product.Car;
import magadiflo.design.patterns.creational.FactoryMethod.chatgpt.product.IVehicle;

public class CarFactory implements IVehicleFactory {
    @Override
    public IVehicle createVehicle() {
        return new Car();
    }
}
