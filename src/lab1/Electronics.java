package lab1;

public class Electronics {
    private int[] usb;
    private int[] keyboards;

    public Electronics(int[] usb, int[] keyboards) {
        this.usb = usb;
        this.keyboards = keyboards;
    }

    public int cheapestKeyboard() {
        int min = keyboards[0];
        for(int k : keyboards) {
            if (k < min)
                min = k;
        }
        return min;
    }

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

    public int mostExpensiveUSB(int budget) {
        int max = -1;
        for(int u : usb) {
            if (u > max && u <= budget)
                max = u;
        }
        return max;
    }

    /*public int maxExpenses(int budget) {

    }*/
}
