package lab1;

public class BigNumbers {
    private int[] nr1;
    private int[] nr2;

    /*checks if the two arrays have the same number of values and if all the values are digits
    * throws exception otherwise*/
    public BigNumbers(int[] nr1, int[] nr2) {
        if (nr1.length != nr2.length)
            throw new IllegalArgumentException("The numbers must have the same numbers of digits");
        for (int value : nr1)
            if(value < 0 || value > 9)
                throw new IllegalArgumentException("Must have an array of digits");
        for (int value : nr2)
            if(value < 0 || value > 9)
                throw new IllegalArgumentException("Must have an array of digits");

        this.nr1 = nr1;
        this.nr2 = nr2;

        // changes the values so that the first number is bigger
        for(int index = 0; index < nr1.length; index++)
            if(nr1[index] < nr2[index]) {
                this.nr1 = nr2;
                this.nr2 = nr1;
                break;
            }
    }

    /*prints the values in the array given as parameter, separated by whitespaces*/
    public void printArray(int[] array) {
        if (array[0] != 0) {
            System.out.print(array[0]);
            System.out.println(" ");
        }
        for(int i = 1; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.println(" ");
        }
        System.out.println();
    }

    /*calculates the sum of the two numbers
    * pre: two numbers represented on arrays
    * post: a new array, representing the sum of the two numbers*/
    public int[] sum() {
        int[] sum = new int[nr1.length + 1];
        int carry = 0;
        for(int i = nr1.length - 1; i >= 0; i--) {
            int s = nr1[i] + nr2[i] + carry;
            if (s >= 10)
                carry = 1;
            else
                carry = 0;
            sum[i+1] = s % 10;
        }
        sum[0] = carry;
        return sum;
    }

    /*calculates the difference of the two numbers
     * pre: two numbers represented on arrays
     * post: a new array, representing the sum of the two numbers*/
    public int[] dif() {
        int[] dif = new int[nr1.length];
        int borrow = 0;

        for(int i = nr1.length - 1; i >= 0; i--) {
            if ((nr1[i] - nr2[i]) >= 0) {
                dif[i] = nr1[i] - nr2[i] - borrow;
                borrow = 0;
            }

            else {
                dif[i] = 10 + nr1[i] - nr2[i] - borrow;
                borrow = 1;
            }
        }
        return dif;
    }

    /*calculates the multiplication of nr1 with a digit
     * pre: a digit given as parameter and a number represented on an array
     * post: a new array, representing the product of the number and the digit*/
    public int[] mul(int digit) {
        if (digit < 0 || digit > 9)
            throw new IllegalArgumentException("Must multiply with a digit");
        int[] mul = new int[nr1.length+1];
        int carry = 0;
        for (int i = nr1.length - 1; i >= 0; i--) {
            int m = digit * nr1[i] + carry;
            if (m > 10)
                carry = m / 10;
            else
                carry = 0;
            mul[i+1] = m % 10;
        }
        mul[0] = carry;
        return mul;
    }

    /*calculates the divison of nr1 by a given digit
     * pre: a digit given as parameter and a number represented on an array
     * post: a new array, representing the division of the number by the digit*/
    public int[] div(int digit) {
        if (digit < 0 || digit > 9)
            throw new IllegalArgumentException("Must divide by a digit");
        int[] div = new int[nr1.length];
        int d = nr1[0];
        for (int i = 0; i < nr1.length-1; i++) {
            int rest = d % digit;
            div[i] = d / digit;
            d = nr1[i+1] + 10*rest;
        }
        div[div.length-1] = d / digit;
        return div;
    }
}
