package magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.creator;

import magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.product.IgvInvoice;
import magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.product.Invoice;

public class IgvFactory implements IInvoiceFactory {
    @Override
    public Invoice createInvoice() {
        return new IgvInvoice();
    }
}
