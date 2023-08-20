package magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.product;

public class ReducedIgvInvoice extends Invoice {
    @Override
    public double getAmountIgv() {
        return this.getAmount() * 1.07;
    }
}
