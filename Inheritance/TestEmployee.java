public class TestEmployee{
    public static void main(String[] args){
        Employee emp = new Employee("kavya", 6000.0, 2021, "KY86F0");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("Insurance Number: " + emp.getInsuranceNumber());
        emp.setName("kavya");
        emp.setSalary(6000.0);
        emp.setYearStarted(2021);
        emp.setInsuranceNumber("KY86F0");
        System.out.println("Updated Employee Name: " + emp.getName());
        System.out.println("Updated Salary: " + emp.getSalary());
        System.out.println("Updated Year Started: " + emp.getYearStarted());
        System.out.println("Updated Insurance Number: " + emp.getInsuranceNumber());
    }
}