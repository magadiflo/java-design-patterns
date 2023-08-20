package magadiflo.design.patterns.creational.FactoryMethod.chatgpt.product;

public class Car implements IVehicle {
    @Override
    public void speedUp() {
        System.out.println("Auto acelerando....");
    }

    @Override
    public void curb() {
        System.out.println("Auto frenando...");
    }
}
