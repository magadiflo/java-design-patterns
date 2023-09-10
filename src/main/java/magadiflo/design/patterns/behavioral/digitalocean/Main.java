package magadiflo.design.patterns.behavioral.digitalocean;

import magadiflo.design.patterns.behavioral.digitalocean.context.Item;
import magadiflo.design.patterns.behavioral.digitalocean.context.ShoppingCart;
import magadiflo.design.patterns.behavioral.digitalocean.strategy.CreditCardStrategy;
import magadiflo.design.patterns.behavioral.digitalocean.strategy.PaypalStrategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        // Pago por PayPal
        cart.pay(new PaypalStrategy("martin@gmail.com", "12345"));

        // Pago con tarjeta de crédito
        cart.pay(new CreditCardStrategy("Lizita", "123456789", "123", "12/23"));
    }
}
