public class Employee extends person{
   private double salary;
   private int yearStarted;
   private String insuranceNumber;
   public Employee(String name, double salary, int yearStarted, String insuranceNumber){
      super(name);
    this.salary = salary;
    this.yearStarted = yearStarted;
    this.insuranceNumber = insuranceNumber;
   }
   public double getSalary(){
    return salary;
   }
   public int getYearStarted(){
    return yearStarted;
   }
   public String getInsuranceNumber(){
    return insuranceNumber;
   }
   public void setSalary(double salary){
    this.salary = salary;
   }
   public void setYearStarted(int yearStarted){
    this.yearStarted = yearStarted;
   }
   public void setInsuranceNumber(String insuranceNumber){
    this.insuranceNumber = insuranceNumber;
   }
}