import java.time.LocalDate;

public class Employee extends Person {
    private int ID;

    public Employee(String firstName, String lastName, int ID) {
        super(firstName, lastName);
        this.ID = ID;
    }

    public Employee(String firstName, String lastName, LocalDate dob, int ID) {
        super(firstName, lastName, dob);
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        // call the Person toString() method and add on the additional data of Employee ID number
        return  "Employee{" +
                "ID=" + ID + super.toString() +
                '}';
    }
}
