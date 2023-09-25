package classes.invoicegenerator;

import classes.invoicegenerator.model.Invoice;

public class InvoiceGenerator {
	
    public static void main(String[] args) {
        // Create an invoice for a customer
        Invoice invoice1 = new Invoice("John Doe");

        // Add items to the invoice
        invoice1.addItem("Product A", 10.0, 3);
        invoice1.addItem("Product B", 15.0, 2);
        invoice1.addItem("Product C", 5.0, 4);

        // Print the invoice
        invoice1.printInvoice();

        // Create another invoice for a different customer
        Invoice invoice2 = new Invoice("Jane Smith");
        invoice2.addItem("Product D", 8.0, 5);
        invoice2.addItem("Product E", 12.0, 3);

        // Print the second invoice
        invoice2.printInvoice();

        // Print the total number of invoices
        Invoice.printTotalInvoices();
    }
}