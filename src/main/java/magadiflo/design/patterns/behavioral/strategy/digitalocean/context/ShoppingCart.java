package magadiflo.design.patterns.behavioral.strategy.digitalocean.context;

import magadiflo.design.patterns.behavioral.strategy.digitalocean.strategy.IPaymentStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Context
 */
public class ShoppingCart {

    List<Item> items = new ArrayList<>();

    public ShoppingCart() {
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        return this.items.stream().mapToInt(Item::getPrice).sum();
    }

    public void pay(IPaymentStrategy paymentMethod) {
        paymentMethod.pay(this.calculateTotal());
    }
}
