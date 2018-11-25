package main.java.com.kinomo.peoples;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private String jobPosition;
    public Employee(int id, String firstName, String lastName, double salary, String jobPosition) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.jobPosition = jobPosition;
    }


    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    public void setFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    double  moneyOverTimes() {
        return this.salary + 20;
    }

    public String getJobPosition() {
        return this.jobPosition;
    }
    public void setJobPosition(String newJobPosition) {
this.jobPosition = newJobPosition;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
