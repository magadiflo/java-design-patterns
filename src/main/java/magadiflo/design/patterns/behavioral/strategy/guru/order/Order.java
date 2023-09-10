package magadiflo.design.patterns.behavioral.strategy.guru.order;

import magadiflo.design.patterns.behavioral.strategy.guru.strategies.IPayStrategy;

/**
 * Clase de orden (Contexto). No sabe el método de pago concreto (estrategia) que ha elegido el usuario.
 * Utiliza una interfaz de estrategia común para delegar la recopilación de datos de pago al
 * objeto de estrategia. Se puede utilizar para guardar pedidos en la base de datos.
 */
public class Order {

    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(IPayStrategy strategy) {
        // Aquí podríamos recopilar y almacenar datos de pago de la estrategia.
        strategy.collectPaymentDetails();
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        this.isClosed = true;
    }
}
