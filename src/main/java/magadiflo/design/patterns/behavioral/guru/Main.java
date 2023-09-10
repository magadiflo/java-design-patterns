package magadiflo.design.patterns.behavioral.guru;

import magadiflo.design.patterns.behavioral.guru.order.Order;
import magadiflo.design.patterns.behavioral.guru.strategies.IPayStrategy;
import magadiflo.design.patterns.behavioral.guru.strategies.PayByCreditCard;
import magadiflo.design.patterns.behavioral.guru.strategies.PayByPayPal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Será nuestro cliente
 */
public class Main {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static IPayStrategy payStrategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            String continueChoice;

            do {
                System.out.println("""
                        Por favor, seleccione un producto:
                        1 - Mother board
                        2 - CPU
                        3 - HDD
                        4 - Memory
                        """);
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);

                System.out.println("Count: ");
                int count = Integer.parseInt(reader.readLine());

                order.setTotalCost(order.getTotalCost() + (cost * count));

                System.out.println("¿Quieres seguir seleccionando productos? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (payStrategy == null) {
                System.out.println("""
                        Por favor, seleccione un método de pago:
                        1 - PayPal
                        2 - Credit Card
                        """);
                String paymentMethod = reader.readLine();

                /**
                 * El cliente crea diferentes estrategias basadas en la información del usuario,
                 * la configuración de la aplicación, etc.
                 */
                if (paymentMethod.equals("1")) {
                    payStrategy = new PayByPayPal();
                } else {
                    payStrategy = new PayByCreditCard();
                }

            }

            /**
             * El objeto de orden (contexto) delega la recopilación de datos de pago al objeto de estrategia,
             * ya que solo las estrategias saben qué datos necesitan para procesar un pago.
             */
            order.processOrder(payStrategy);

            System.out.println("¿Pagar S/ " + order.getTotalCost() + " o continuar con la compra? P/C: ");
            String proceed = reader.readLine();

            if (proceed.equalsIgnoreCase("P")) {
                // Finalmente, la estrategia maneja el pago
                if (payStrategy.pay(order.getTotalCost())) {
                    System.out.println("¡El pago ha sido exitoso!");
                } else {
                    System.out.println("¡Falló! por favor, verifique sus datos.");
                }

                order.setClosed();
            }
        }
    }
}
