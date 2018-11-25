package main.java.com.kinomo.resourses;

import main.java.com.kinomo.peoples.Employee;
import main.java.com.kinomo.models.Model;

public class Audit {
    private double allMoney;
    private int amountPeople;
    private boolean isWeekend;
    private String currency;

    public Audit(double getMoney, double leftMoney, int amountPeople, boolean isWeekend, String currency) {
        this.allMoney = getMoney + leftMoney;
        this.amountPeople = amountPeople;
        this.isWeekend = isWeekend;
        this.currency = currency;
    }

    public int medianSalary() {
        return (int) this.allMoney / (this.amountPeople);
    }

    public void setSalary(Employee employee) {

        if (employee.getJobPosition() == "middle") {
            employee.setSalary(employee.getSalary() + 200);
        } else {
            if (employee.getJobPosition() == "senior") {
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


}
