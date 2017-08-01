import java.time.LocalDate;
import java.util.Arrays;

public class Student extends Person {
    private int ID;
    public int[] testScores;
    public String grade;

    public Student(String firstName, String lastName, int studentID) {
        super(firstName, lastName);
        ID = studentID;
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

    private void CalculateGrade() {
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

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "ID=" + ID +
                ", testScores=" + Arrays.toString(testScores) +
                ", grade='" + grade + '\'' +
                '}';
    }
}
