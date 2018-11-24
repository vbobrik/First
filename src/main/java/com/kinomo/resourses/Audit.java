package main.java.com.kinomo.resourses;
import main.java.com.kinomo.peoples.Employee;

public class Audit {
    private Employee employee;
    public Audit(Employee employee) {
        this.employee = employee;
    }

    public void setSalary() {

        if(this.employee.getJobPosition() == "middle") {
            this.employee.setSalary(this.employee.getSalary() + 200);
        } else {
            if (this.employee.getJobPosition() == "senior") {
                this.employee.setSalary(this.employee.getSalary() + 700.5);
            }
        }
    }

}
