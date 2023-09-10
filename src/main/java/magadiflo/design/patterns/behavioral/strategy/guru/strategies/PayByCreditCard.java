package magadiflo.design.patterns.behavioral.strategy.guru.strategies;

import magadiflo.design.patterns.behavioral.strategy.guru.strategies.auxiliaries.CreditCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Estrategia concreta. Implementa método de pago con tarjeta de crédito.
 */
public class PayByCreditCard implements IPayStrategy {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard creditCard;

    /**
     * Recopilar datos de tarjetas de crédito.
     */
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Ingrese número de tarjeta: ");
            String number = READER.readLine();

            System.out.println("Ingrese fecha de expiración de la tarjeta 'mm/yy': ");
            String date = READER.readLine();

            System.out.println("Ingrese el código CVV: ");
            String cvv = READER.readLine();

            this.creditCard = new CreditCard(number, date, cvv);
            // TODO validar número de tarjeta de crédito...

        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    /**
     * Después de la validación de la tarjeta podemos cargar la tarjeta de crédito del cliente.
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (this.cardIsPresent()) {
            System.out.println("Pagando S/ " + paymentAmount + " usando tarjeta de crédito");
            this.creditCard.setAmount(this.creditCard.getAmount() - paymentAmount);
            return true;
        }
        return false;
    }

    private boolean cardIsPresent() {
        return this.creditCard != null;
    }
}
