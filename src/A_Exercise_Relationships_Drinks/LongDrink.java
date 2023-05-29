package A_Exercise_Relationships_Drinks;

public class LongDrink extends Drink{
    protected Liquid spirituous;
    protected Liquid filler;

    public LongDrink(String name, Liquid spirituous, Liquid filler) {
        super(name);
        this.spirituous = spirituous;
        this.filler = filler;
    }


    public Liquid getSpirituous() {
        return spirituous;
    }

    public void setSpirituous(Liquid spirituous) {
        this.spirituous = spirituous;
    }

    public Liquid getFiller() {
        return filler;
    }

    public void setFiller(Liquid filler) {
        this.filler = filler;
    }

    public int getNumberOfIngredients() {
            return 2;
    }
    public boolean containsAlcohol() {
        return true;
    }

    public double amountInML(){
        return 500;
    }

    public boolean combustible() {
        double sum = spirituous.getAlcoholPercent() + filler.getAlcoholPercent();
        if(sum >= 30){
            return true;
        }
        else return false;
    }
}
