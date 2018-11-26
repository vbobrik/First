package main.java.com.kinomo.audit;

import main.java.com.kinomo.models.Employee;
import main.java.com.kinomo.models.Model;

public class Management {
    private double allMoney;
    private int amountPeople;

    private Employee employee;
    private Model model;

    public Management(Employee employee, Model model) {
        this.employee = employee;
        this.model = model;
    }

    public Management(double getMoney, double leftMoney, int amountPeople) {
        this.allMoney = getMoney + leftMoney;
        this.amountPeople = amountPeople;

    }

    public int medianSalary() {
        return (int) this.allMoney / (this.amountPeople);
    }

    public void setNewSalary(Employee employee) {

        if (employee.getJobPosition() == "middle") {
            employee.setSalary(employee.getSalary() + 200);
        } else if (employee.getJobPosition() == "senior") {
            employee.setSalary(employee.getSalary() + 700.5);
        }
    }
        this.allMoney = this.allMoney - employee.getSalary();
}

    public double getAllMoney() {
        return this.allMoney;
    }

    public void setAllMoney(double money) {
        this.allMoney = money;
    }

    public int getAmountPeople() {
        return this.amountPeople;
    }

    public void setAmountPeople(int newAmountPeople) {
        this.amountPeople = newAmountPeople;
    }

    public void buyModels(int amountModels) {
        int x;
        for (x = 1; x <= amountModels; x++) {
            Model model1 = new Model(0, 123456, "asset", 20);
            this.allMoney = this.allMoney - model1.getModelPrice();
        }
    }

    public void getFullName() {
       this.employee.getFirstName() + this.employee.getLastName();
            }


}
