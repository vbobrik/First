package main.java.com.kinomo.models;
import main.java.com.kinomo.audit.Management;
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

    public void setId(int id) {
        this.id = id;
    }
    public int detId() {
        return this.id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public double  moneyOverTimes() {
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
