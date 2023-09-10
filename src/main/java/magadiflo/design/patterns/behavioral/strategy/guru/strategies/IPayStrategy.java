package magadiflo.design.patterns.behavioral.strategy.guru.strategies;

/**
 * Interfaz común para todas las estrategias (medios de pago).
 */
public interface IPayStrategy {
    void collectPaymentDetails();

    boolean pay(int paymentAmount);
}
