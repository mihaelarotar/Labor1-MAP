package lab1;

public class Electronics {
    private int[] usb;
    private int[] keyboards;

    /*checks if the arrays of prices contains positive values
    * throws exception otherwise*/
    public Electronics(int[] usb, int[] keyboards) {
        if (usb.length == 0 || keyboards.length == 0)
            throw new IllegalArgumentException("No products available");
        for (int u : usb)
            if (u < 0)
                throw new IllegalArgumentException("Price cannot be negative");
        for (int k : keyboards)
            if (k < 0)
                throw new IllegalArgumentException("Price cannot be negative");
        this.usb = usb;
        this.keyboards = keyboards;
    }

    /*returns the value of the cheapest keyboard in the array of keyboards*/
    public int cheapestKeyboard() {
        int min = keyboards[0];
        for(int k : keyboards) {
            if (k < min)
                min = k;
        }
        return min;
    }

    /*returns the value of the most expensive object in the arrays*/
    public int mostExpensiveObject() {
        int max = keyboards[0];
        for(int k : keyboards) {
            if (k > max)
                max = k;
        }
        for(int u : usb) {
            if (u > max)
                max = u;
        }
        return max;
    }

    /*returns the value of the most expensive USB that can be bought with the budget given as parameter*/
    public int mostExpensiveUSB(int budget) {
        int max = -1;
        for(int u : usb) {
            if (u > max && u <= budget)
                max = u;
        }
        return max;
    }

    /*returns the maximum value of the objects that can be bought with the budget given as parameter*/
    public int maxExpenses(int budget) {
        int max = -1;
        for (int k : keyboards)
            for (int u : usb)
                if (k + u <= budget && k + u > max)
                    max = k + u;
        return max;
    }
}
