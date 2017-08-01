import java.time.LocalDate;

public class Grad extends Student {
    public Grad(String firstName, String lastName, int studentID) {
        super(firstName, lastName, studentID);
    }

    public Grad(String firstName, String lastName, LocalDate dob, int studentID) {
        super(firstName, lastName, dob, studentID);
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

        if(average >= 95.0) {
            setGrade("A");
        } else {
            setGrade("F");
        }

    }
}
