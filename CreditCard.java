public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person owner, Money balance, Money creditLimit) {
        this.owner = owner;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    // Alternate Constructor for Problem 2
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit.getDollars(), creditLimit.getCents());
        this.balance = new Money(0, 0);
    }

    // Getters and setters

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Money getBalance() {
        return new Money(balance.getDollars(), balance.getCents());
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Money creditLimit) {
        this.creditLimit = creditLimit;
    }

    // Get available credit for Problem 3
    public Money getAvailableCredit() {
        Money availableCredit = new Money(creditLimit.getDollars(), creditLimit.getCents());
        availableCredit.subtract(balance);
        return availableCredit;
    }
}
