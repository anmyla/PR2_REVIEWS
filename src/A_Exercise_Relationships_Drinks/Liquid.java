package A_Exercise_Relationships_Drinks;

public class Liquid {
    private String name;
    private double amount;
    private double alcoholPercent;

    public Liquid(String name, double amount, double alcoholPercent) {
        this.name = name;
        this.amount = amount;
        this.alcoholPercent = alcoholPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }


    public boolean combustible() {
        if(getAlcoholPercent() >= 30){
            return true;
        }
        else return false;
    }
}
