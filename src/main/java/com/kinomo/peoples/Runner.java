package main.java.com.kinomo.peoples;

import main.java.com.kinomo.resourses.Audit;

public class Runner {
    public static void main(String args[]) {
        int number = 123;
        String bla = "Steve";
        Employee Stefan = new Employee(number, "Stefan", "Tear", 300, "junior", true, 35 );
        Employee John = new Employee(1234, "John", "Smight", 450.605, "middle", true, 350 );
        Employee Helen = new Employee(12345, "Helen", "Pork", 200.2, "senior", false, 750);
        Audit calcEngineer = new Audit(Stefan);
        calcEngineer.setSalary();
        System.out.println(Stefan.getFullName()  + " has salary: " + Stefan.getSalary());
        Audit calcAutomation = new Audit(John);
        calcAutomation.setSalary();
        System.out.println(John.getFullName()  + " has salary: " + John.getSalary());
        Audit calcSalor = new Audit(Helen);
        calcSalor.setSalary();
        System.out.println(Helen.getFullName()  + " has salary: " + Helen.getSalary());

    }
}
