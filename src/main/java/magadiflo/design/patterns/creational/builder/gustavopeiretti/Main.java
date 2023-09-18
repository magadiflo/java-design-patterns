package magadiflo.design.patterns.creational.builder.gustavopeiretti;

import magadiflo.design.patterns.creational.builder.gustavopeiretti.builder.BankAccountBuilder;
import magadiflo.design.patterns.creational.builder.gustavopeiretti.product.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccountBuilder builder = new BankAccountBuilder(12345L);
        BankAccount b1 = builder.balance(1000.20)
                .owner("Oaken")
                .interestRate(10.5)
                .type("PLATINIUM")
                .build();
        System.out.println(b1);

        BankAccount b2 = new BankAccountBuilder(12345L)
                .balance(1000.20)
                .owner("Oaken")
                .interestRate(10.5)
                .type("PLATINIUM")
                .build();
        System.out.println(b2);
    }
}
