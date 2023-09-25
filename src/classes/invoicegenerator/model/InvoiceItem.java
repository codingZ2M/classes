package classes.invoicegenerator.model;

public class InvoiceItem {
	
    private String itemName;
    private double itemPrice;
    private int quantity;

    public InvoiceItem(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public double getTotal() {
        return itemPrice * quantity;
    }

    public String toString() {
        return itemName + " - $" + itemPrice + " x " + quantity + " = $" + getTotal();
    }
}
