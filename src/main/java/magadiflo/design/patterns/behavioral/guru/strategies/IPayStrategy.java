package magadiflo.design.patterns.behavioral.guru.strategies;

/**
 * Interfaz común para todas las estrategias (medios de pago).
 */
public interface IPayStrategy {
    void collectPaymentDetails();

    boolean pay(int paymentAmount);
}
