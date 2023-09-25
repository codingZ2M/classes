package classes.invoicegenerator.model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
	
    private static int invoiceCounter = 1000;
    private int invoiceNumber;
    private String customerName;
    private List<InvoiceItem> items;

    public Invoice(String customerName) {
        this.invoiceNumber = invoiceCounter++;
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(String itemName, double itemPrice, int quantity) {
        items.add(new InvoiceItem(itemName, itemPrice, quantity));
    }

    public double getTotalAmount() {
        double total = 0;
        for (InvoiceItem item : items) {
            total += item.getTotal();
        }
        return total;
    }

    public void printInvoice() {
        System.out.println("Invoice #" + invoiceNumber);
        System.out.println("Customer: " + customerName);
        System.out.println("Items:");
        for (InvoiceItem item : items) {
            System.out.println("  " + item);
        }
        System.out.println("Total Amount: $" + getTotalAmount());
    }

    // Static method to access and print the total number of invoices
    public static void printTotalInvoices() {
        System.out.println("Total Invoices: " + invoiceCounter);
    }
}