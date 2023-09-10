package magadiflo.design.patterns.behavioral.strategy.digitalocean.strategy;

/**
 * Concrete Strategies
 */
public class PaypalStrategy implements IPaymentStrategy {
    private String emailId;
    private String passsword;

    public PaypalStrategy(String emailId, String passsword) {
        this.emailId = emailId;
        this.passsword = passsword;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " pagado usando Paypal.");
    }
}
