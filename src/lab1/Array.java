package lab1;

import org.jetbrains.annotations.NotNull;

public class Array {

    private int[] values;

    /**
     * checks if the array given as parameter contains positive values
     * @exception IllegalArgumentException thrown if values are not positive
     * @param values an array of numbers
     */
    public Array(int @NotNull [] values) {
        if(values.length == 0)
            throw new IllegalArgumentException("n cannot be 0");
        for (int v : values)
            if(v <= 0)
                throw new IllegalArgumentException("Values should be positive");
        this.values = values;
    }

    /**
     * max value in an array
     * @return the maximum value in the array
     */
    public int maxValue() {
        int max = values[0];
        for(int v : values) {
            if (v > max)
                max = v;
        }
        return max;
    }

    /**
     * min value in an array
     * @return returns the minimum value in the array
     */
    public int minValue() {
        int min = values[0];
        for(int v : values) {
            if (v < min)
                min = v;
        }
        return min;
    }

    /**
     * max sum of n-1 values
     * @return the maximum sum (the sum of the values - the minimum value)
     */
    public int maxSum() {
        int sum = 0;
        for(int v : values) {
            sum += v;
        }
        return sum - minValue();
    }

    /**
     * min sum of n-1 values
     * @return the minimum sum (the sum of the values - the maximum value)
     */
    public int minSum() {
        int sum = 0;
        for(int v : values) {
            sum += v;
        }
        return sum - maxValue();
    }

}
