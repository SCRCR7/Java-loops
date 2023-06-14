public class MoneyDriver {
        public static void main(String[] args) {
            Money money1 = new Money(500, 0);
            Money money2 = new Money(10, 2);
            Money money3 = new Money(10, 88);

            // Adding money2 to money1
            Money sum = new Money(money1.getDollars(), money1.getCents());
            sum.setDollars(sum.getDollars() + money2.getDollars());
            sum.setCents(sum.getCents() + money2.getCents());

            // Subtracting money3 from sum
            Money difference = new Money(sum.getDollars(), sum.getCents());
            difference.setDollars(difference.getDollars() - money3.getDollars());
            difference.setCents(difference.getCents() - money3.getCents());

            System.out.println("The current amount is " + money1);
            System.out.println("Adding " + money2 + " gives " + sum);
            System.out.println("Subtracting " + money3 + " gives " + difference);

            System.out.println(money2 + " equals " + money2);
            System.out.println(money3 + " does not equal " + money2);
        }
    }

}



