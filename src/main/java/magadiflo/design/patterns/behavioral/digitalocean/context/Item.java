package magadiflo.design.patterns.behavioral.digitalocean.context;

public class Item {
    private final String upcCode;
    private final int price;

    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}
