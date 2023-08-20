package magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.creator;

import magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.product.Invoice;

public interface IInvoiceFactory {
    Invoice createInvoice();
}
