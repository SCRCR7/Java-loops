public class Mon {
    public class Money {
        private int dollars;
        private int cents;

        // Constructor
        public Money(int dollars, int cents) {
            this.dollars = dollars;
            this.cents = cents;
        }

        // Getters and setters

        public int getDollars() {
            return dollars;
        }

        public void setDollars(int dollars) {
            this.dollars = dollars;
        }

        public int getCents() {
            return cents;
        }

        public void setCents(int cents) {
            this.cents = cents;
        }

        /**
         * Compares the calling object with the parameter object for equality.
         * Returns true if the dollars and cents of both objects are the same.
         * Otherwise, returns false.
         *
         * @param obj The object to compare with.
         * @return True if the objects are equal, false otherwise.
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Money otherMoney = (Money) obj;

            return dollars == otherMoney.dollars && cents == otherMoney.cents;
        }
    }

}
