package lab1;


public class Uni {

    /**
     * checks if the array given as parameter contains integers between 0 and 100
     * @exception IllegalArgumentException thrown otherwise
     * @param grades array of grades
     */
    public void checkGrades(int[] grades) {
        if (grades.length == 0)
            throw new IllegalArgumentException("Array is empty");
        for (int g : grades)
            if (g <= 0 || g > 100)
                throw new IllegalArgumentException("Grades must be between 0 and 100");
    }

    /**
     * prints the grades in the array given as parameter
     * @param grades array of grades
     */
    public void printGrades(int[] grades) {
        for (int g : grades)
            if (g > 0)
                System.out.println(g);
    }

    /**returns a new array, containing the failing grades
     * @param grades array of grades
     * @return a new array with the grades < 40
     */
    public int[] failingGrade(int[] grades) {
        checkGrades(grades);
        int[] failingGrades = new int[grades.length];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                failingGrades[index] = grade;
                index++;
            }
        }
        return failingGrades;
    }

    /**
     * calculates the average grade from the values in the array
     * @param grades an array with the grades
     * @return a real number representing the average grade
     */
    public double averageGrade(int[] grades) {
        checkGrades(grades);
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    /**
     * calculates the next multiple of 5 of the nr given as parameter
     * @param nr a real number
     * @return the next multiple of 5 of the nr given as parameter
     */
    public double nextMultiple(double nr) {
        return Math.ceil(nr / 5) * 5;
    }

    /**
     * returns a new array, containing the rounded grades
     * @param grades an array with the grades
     * @return a new array with the rounded grades
     */
    public int[] roundedGrade(int[] grades) {
        checkGrades(grades);
        int[] roundedGrades = new int[grades.length];
        int index = 0;
        for (int grade : grades) {
            if ((nextMultiple(grade) - grade) < 3 && grade >= 38)
                roundedGrades[index] = (int) nextMultiple(grade);

            else
                roundedGrades[index] = grade;

            index++;
        }
        return roundedGrades;
    }

    /**
     * calculates the maximum rounded grade from the values in the array
     * @param grades an array with the grades
     * @return the maximum rounded grade
     */
    public int maxGrade(int[] grades) {
        checkGrades(grades);
        int[] roundedGrades = roundedGrade(grades);
        int max = roundedGrades[0];
        for (int v : roundedGrades) {
            if (v > max)
                max = v;
        }
        return max;
    }
}