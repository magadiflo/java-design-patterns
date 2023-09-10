package magadiflo.design.patterns.behavioral.strategy.digitalocean.strategy;

/**
 * Concrete Strategies
 */
public class CreditCardStrategy implements IPaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " pagado con tarjeta de crédito/débito");
    }
}
