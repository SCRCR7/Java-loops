public class Money {
    private double amount;
    private String currency;

    // Default constructor
    public Money() {
        // Initialize with default values
        amount = 0.0;
        currency = "USD";
    }

    // Parameterized constructor
    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // Copy constructor
    public Money(Money otherMoney) {
        // Copy the values from the otherMoney object
        this.amount = otherMoney.amount;
        this.currency = otherMoney.currency;
    }

    // Other methods and operations...

    public static void main(String[] args) {
        Money originalMoney = new Money(100.0, "USD");
        Money copiedMoney = new Money(originalMoney); // Creating a copy using the copy constructor

        System.out.println("Original money: " + originalMoney.getAmount() + " " + originalMoney.getCurrency());
        System.out.println("Copied money: " + copiedMoney.getAmount() + " " + copiedMoney.getCurrency());
    }

    // Getters and setters...
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
