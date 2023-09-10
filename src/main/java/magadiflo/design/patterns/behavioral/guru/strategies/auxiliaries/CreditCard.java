package magadiflo.design.patterns.behavioral.guru.strategies.auxiliaries;

/**
 * Clase de tarjeta de crédito ficticia.
 */
public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cvv;

    public CreditCard(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
