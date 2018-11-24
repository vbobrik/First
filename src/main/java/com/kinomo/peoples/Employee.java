package main.java.com.kinomo.peoples;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private String jobPosition;
    private boolean isMan;
    private int workingDays;
    public Employee(int id, String firstName, String lastName, double salary, String jobPosition, boolean isMan, int workingDays) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.jobPosition = jobPosition;
        this.isMan = isMan;
        this.workingDays = workingDays;
    }


    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    double  moneyOverTimes() {
        return this.salary + 20;
    }

    public String getJobPosition() {
        return this.jobPosition;
    }
    public void setJobPosition() {

    }
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
