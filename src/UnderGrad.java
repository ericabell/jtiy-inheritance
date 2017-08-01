import java.io.FileNotFoundException;
import java.time.LocalDate;

public class UnderGrad extends Student {

    public UnderGrad(String firstName, String lastName, int studentID) {
        // use this() instead of super
        super(firstName, lastName, studentID);
    }

    public UnderGrad(String firstName, String lastName, LocalDate dob, int studentID) {
        super(firstName, lastName, dob, studentID);
    }

    public String getGrade() {
        // update the letter grade based on the test scores

        // btw, camelCase so make it calcualteGrade
        CalculateGrade();
        return grade;
    }

    private void setGrade(String grade) {
        this.grade = grade;
    }

    // cannot make method accessor less visable and cannot throw a broader execption
    private void CalculateGrade() throws Exception {
        // calculates student's grade based on their test score average
        double total = 0;
        for( int score : testScores )
            total += score;
        double average = total / testScores.length;

        if(average >= 93.0) {
            setGrade("A");
        } else if(average >= 88.0) {
            setGrade("B");
        } else {
            setGrade("F");
        }

    }

    // cann make method accessor more visable and can throw a narrower execption
    @Override
    public  boolean isBig(int num) throws FileNotFoundException {
        if (num > 6) {
            return true;
        }
        return false;
    }
}
