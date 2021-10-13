package lab1;

public class Array {
    private int[] values;
    public Array(int[] v) {values = v;}

    public int maxValue() {
        int max = values[0];
        for(int v : values) {
            if (v > max)
                max =v;
        }
        return max;
    }

    public int minValue() {
        int min = values[0];
        for(int v : values) {
            if (v < min)
                min =v;
        }
        return min;
    }

    public int maxSum() {
        int sum = 0;
        for(int v : values) {
            sum += v;
        }
        return sum - maxValue();
    }

    public int minSum() {
        int sum = 0;
        for(int v : values) {
            sum += v;
        }
        return sum - minValue();
    }

}
