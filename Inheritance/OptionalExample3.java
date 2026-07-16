import java.util.Optional;

class Employee {
    int id = 101;
    String name = "Kiran";
}

class InvalidEmployeeException extends Exception {
    InvalidEmployeeException(String msg) {
        super(msg);
    }
}

public class OptionalExample3 {

    public static void main(String[] args) {

        Employee emp = null;

        try {
            Employee e = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee"));

            System.out.println(e.id + " " + e.name);

        } catch (InvalidEmployeeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}