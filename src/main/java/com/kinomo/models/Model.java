package main.java.com.kinomo.models;

import main.java.com.kinomo.peoples.Employee;

public class Model {
    private int amountProjects;
    public int id;
    private String type;
    private int modelPrice;

    public Model(int amountProjects, int id, String type, int modelPrice) {
        this.amountProjects = amountProjects;
        this.id = id;
        this.type = type;
        this.modelPrice = modelPrice;
    }

    public void setAmountProjects(int newValue) {
        this.amountProjects = newValue;
    }
    public int getAmountProjects() {
        return this.amountProjects;
    }
    public int getModelPrice() {
        return this.modelPrice;
    }
    public void setModelPrice(int price) {
        this.modelPrice = this.modelPrice;
    }
public int getId() {
        return this.id;
}
public void setId(int newId) {
        this.id = newId;
}
public String getType() {
        return this.type;
}
public void setType(String newType) {
        this.type = newType;
}
}
