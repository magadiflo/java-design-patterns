package magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava;

import magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.creator.IInvoiceFactory;
import magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.creator.IgvFactory;
import magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.creator.ReduceIgvFactory;
import magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.product.IgvInvoice;
import magadiflo.design.patterns.creational.FactoryMethod.arquitecturajava.product.ReducedIgvInvoice;

public class Main {
    public static void main(String[] args) {
        // Factura IGV
        IInvoiceFactory igvFactory = new IgvFactory();
        IgvInvoice igvInvoice = (IgvInvoice) igvFactory.createInvoice();
        igvInvoice.setId(1);
        igvInvoice.setAmount(100);
        System.out.println(igvInvoice.getAmountIgv());

        // Factura IGV Reducido
        IInvoiceFactory reduceIgvFactory = new ReduceIgvFactory();
        ReducedIgvInvoice reduceIgvInvoice = (ReducedIgvInvoice) reduceIgvFactory.createInvoice();
        reduceIgvInvoice.setId(2);
        reduceIgvInvoice.setAmount(100);
        System.out.println(reduceIgvInvoice.getAmountIgv());
    }
}
