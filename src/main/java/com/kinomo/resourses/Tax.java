package main.java.com.kinomo.resourses;

public class Tax {
    private double taxPercent = 0.2;
    public Tax() {
    }

    public int countPercent(double amountModels) {
        return (int) (amountModels * taxPercent);
    }
    public double getTaxPersent() {
        return this.taxPercent;
    }
    public void setTaxPercent(int amountN) {
        this.taxPercent = this.taxPercent;
    }
}
