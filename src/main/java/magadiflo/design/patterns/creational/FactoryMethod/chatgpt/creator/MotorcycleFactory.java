package magadiflo.design.patterns.creational.FactoryMethod.chatgpt.creator;

import magadiflo.design.patterns.creational.FactoryMethod.chatgpt.product.IVehicle;
import magadiflo.design.patterns.creational.FactoryMethod.chatgpt.product.Motorcycle;

public class MotorcycleFactory implements IVehicleFactory {
    @Override
    public IVehicle createVehicle() {
        return new Motorcycle();
    }
}
