import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

public class Student extends Person {
    private int ID;
    protected int[] testScores;

    // two options
    //  1. remove this and calcuate in the getGrade method
    //  2. keep it and calcualate in setTestScores and do not calculate in the getGrade method
    protected String grade;

    public Student(String firstName, String lastName, int studentID) {
        this(firstName, lastName, null, studentID);
    }

    public Student(String firstName, String lastName, LocalDate dob, int studentID) {
        super(firstName, lastName, dob);
        ID = studentID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int[] getTestScores() {
        return testScores;
    }

    public void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }

    public String getGrade() {
        // update the letter grade based on the test scores
        CalculateGrade();
        return grade;
    }

    private void setGrade(String grade) {
        this.grade = grade;
    }

    protected void CalculateGrade() throws IOException {
        // calculates student's grade based on their test score average
        double total = 0;
        for( int score : testScores )
            total += score;
        double average = total / testScores.length;

        if(average >= 90.0) {
            setGrade("A");
        } else if(average >= 80.0) {
            setGrade("B");
        } else {
            setGrade("F");
        }

    }

    protected boolean isBig(int num) throws IOException {
        if (num > 5) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "ID=" + ID +
                ", testScores=" + Arrays.toString(testScores) +
                ", grade='" + grade + '\'' +
                '}';
    }
}
