package magadiflo.design.patterns.behavioral.strategy.guru.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Estrategia concreta. Implementa el método de pago PayPal.
 */
public class PayByPayPal implements IPayStrategy {

    private static final Map<String, String> DATA_BASE = new HashMap<>();

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedId;

    static {
        DATA_BASE.put("martin", "martin@gmail.com");
        DATA_BASE.put("tinkler", "tinkler@gmail.com");
    }

    /**
     * Recoger datos del cliente.
     */
    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedId) {
                System.out.println("Ingrese su email de usuario: ");
                this.email = READER.readLine();

                System.out.println("Ingrese su contraseña: ");
                this.password = READER.readLine();

                if (this.verify()) {
                    System.out.println("¡Verificación de datos exitoso!");
                } else {
                    System.out.println("Contraseña o email incorrecto");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Guarde los datos del cliente para futuros intentos de compra.
     */
    @Override
    public boolean pay(int paymentAmount) {
        if (this.signedId) {
            System.out.println("Pagando S/ " + paymentAmount + " usando PayPal.");
            return true;
        }
        return false;
    }

    private boolean verify() {
        this.setSignedIn(this.email.equals(DATA_BASE.get(this.password)));
        return signedId;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedId = signedIn;
    }
}
