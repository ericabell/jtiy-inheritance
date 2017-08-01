import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	// write your code here


    // ASSIGNMENT:
    // Come up with your own inheritance hierarchy with the following
        // constraints:
        // 1. min of 3 levels
        // 2. at least 2 instance var in each class, but only 1 is
        //    a param in the constructor
        // 3. a method that can be overriden and an abstract method
        //    in the highest superclass.
        // 4. each class has a toString and call super.toString

    // MY HEIRARCHY:
    //   Person is highest superclass.
    //     A Student is a Person and an Employee is a Person
    //        A GradStudent is a Student and an UnderGrad is a Student

        // Test Person Class
        // commented out because Person is abstract and can't be instantiated
//        Person person1 = new Person("John", "Doe", LocalDate.of(1999, Month.MAY, 14));
//        System.out.println(person1);

        // Test Employee Class
        Employee employee1 = new Employee("Mike", "Done", LocalDate.of(1999, Month.MAY, 14), 1);
        System.out.println(employee1);

        employee1.setID(2);
        System.out.println(employee1);

        // Test Student Class
        Student student1 = new Student("Bob", "Schafer", LocalDate.of(1980, Month.JUNE, 7), 10);
        System.out.println(student1);
        // Add some test scores
        int[] scores = {
                90,91,92
        };
        student1.setTestScores(scores);
        System.out.println("Grade: " + student1.getGrade());

        // Test UnderGrad Class
        UnderGrad student2 = new UnderGrad("Shane", "Wright", LocalDate.of(1981, Month.JUNE, 7), 11);
        System.out.println(student2);
        student2.setTestScores(scores);
        System.out.println("Grade: " + student2.getGrade());

        // Test Grad Class
        Grad student3 = new Grad("Richard", "Dickens", LocalDate.of(1980, Month.SEPTEMBER, 7), 12);
        System.out.println(student3);
        student3.setTestScores(scores);
        System.out.println("Grade: " + student3.getGrade());

        // EPIC - wrap the Integer class in MutableInteger
        MutableInteger mutInt = new MutableInteger(3);
        System.out.println(mutInt.getMyInt());
        mutInt.setMyInt(4);
        System.out.println(mutInt.getMyInt());

    }
}
