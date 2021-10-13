package lab1;

public class Uni {


    public int[] failingGrade(int[] grades) {
        int[] failingGrades = new int[100];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                failingGrades[index] = grade;
                index++;
            }
        }
        return failingGrades;

    }

    public double averageGrade(int[] grades) {
        int sum = 0, count = 0;
        for (int grade : grades) {
            sum += grade;
            count++;
        }
        return (double) sum / count;
    }

    public double nextMultiple(double nr) {
        return Math.ceil(nr / 5) * 5;
    }

    public int[] roundedGrade(int[] grades) {
        int[] roundedGrades = new int[100];
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

    public int maxGrade(int[] grades) {
        int[] roundedGrades = roundedGrade(grades);
        int max = roundedGrades[0];
        for (int v : roundedGrades) {
            if (v > max)
                max = v;
        }
        return max;
    }
}
