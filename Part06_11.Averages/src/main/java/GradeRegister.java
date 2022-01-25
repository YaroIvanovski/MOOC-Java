
import java.util.ArrayList;
 
public class GradeRegister {
    private ArrayList<Integer> examPoints;
    private ArrayList<Integer> grades;
 
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }
 
    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }
 
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
 
        return count;
    }
 
    public static int pointsToGrade(int points) {
 
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
 
        return grade;
    }
    
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        int sumOfGrades = 0;
        for (Integer value : this.grades) {
            sumOfGrades += value;
        }
        return 1.0 * sumOfGrades / this.grades.size();
    }
    
    public double averageOfPoints() {
        if (this.examPoints.isEmpty()) {
            return -1;
        }
        int sumOfexamPoints = 0;
        for (Integer value : this.examPoints) {
            sumOfexamPoints += value;
        }
        return 1.0 * sumOfexamPoints / this.examPoints.size();
        
    }
}