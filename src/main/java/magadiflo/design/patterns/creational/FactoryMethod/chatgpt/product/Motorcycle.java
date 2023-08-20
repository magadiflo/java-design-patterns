package magadiflo.design.patterns.creational.FactoryMethod.chatgpt.product;

public class Motorcycle implements IVehicle {
    @Override
    public void speedUp() {
        System.out.println("Motocicleta acelerando...");
    }

    @Override
    public void curb() {
        System.out.println("Motocicleta frenando...");
    }
}
