package magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.product;

public abstract class Invoice {
    private int id;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract double getAmountIgv();
}
