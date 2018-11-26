package main.java.com.kinomo.audit;

import main.java.com.kinomo.audit.Management;
import main.java.com.kinomo.audit.Tax;
import main.java.com.kinomo.models.Employee;

public class Runner {
    public static void main(String args[]) {
        int number = 123;
        Employee stefan = new Employee(number, "Stefan", "Tear", 300, "junior");
        Employee john = new Employee(1234, "John", "Smight", 450.605, "middle" );
        Employee helen = new Employee(12345, "Helen", "Pork", 200.2, "senior");

        Model model1 = new Model(1, 1, "", 1);

        Management auditForStefan = new Management(100460, 402.55, 13, false, "BYN");

        auditForStefan.getFullName();
        System.out.println(auditForStefan.getFullName()  + " has salary: " + stefan.getSalary());



        System.out.println("Median salary: " + audit1.medianSalary());
        System.out.println("All money amount: " + audit1.getAllMoney());
        audit1.setSalary(john);
        System.out.println(john.getFullName()  + " has salary: " + john.getSalary());
        System.out.println("All money amount: " + audit1.getAllMoney());
        audit1.setSalary(stefan);

        System.out.println("All money amount: " + audit1.getAllMoney());
        audit1.setSalary(helen);
        System.out.println(helen.getFullName()  + " has salary: " + helen.getSalary());
        System.out.println("All money amount: " + audit1.getAllMoney());
        audit1.buyModels(6);

        Tax showPercent = new Tax();
        System.out.println(showPercent.countPercent(6));
        System.out.println("All money amount after buying of 6 models: " + audit1.getAllMoney());
        audit1.buyModels(3);
        System.out.println("We bought 3 models. All money amount: " + audit1.getAllMoney());
        System.out.println(showPercent.countPercent(3));


    }
}
