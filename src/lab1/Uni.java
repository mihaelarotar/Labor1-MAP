package lab1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Uni {


    public List<Integer> failingGrade(List<Integer> grades) {
        List<Integer> failingGrades = new ArrayList<>();
        for (int grade : grades) {
            if (grade < 40)
                failingGrades.add(grade);
        }
        return failingGrades;
    }

    public double averageGrade(List<Integer> grades) {
        int sum = 0;
        for(int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public double nextMultiple(double nr) {
        return Math.ceil(nr / 5) * 5;
    }

    public List<Integer> roundedGrade(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        for (int grade : grades) {
            if ((nextMultiple(grade) - grade) < 3 && grade >= 38)
                roundedGrades.add((int)nextMultiple(grade));
            else
                roundedGrades.add(grade);
        }
        return roundedGrades;
    }

    public int maxGrade(List<Integer> grades) {
        List<Integer> roundedGrades = roundedGrade(grades);
        return Collections.max(roundedGrades);
    }
}
