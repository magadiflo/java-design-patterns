package magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.creator;

import magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.product.Invoice;
import magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.product.ReducedIgvInvoice;

public class ReduceIgvFactory implements IInvoiceFactory {
    @Override
    public Invoice createInvoice() {
        return new ReducedIgvInvoice();
    }
}