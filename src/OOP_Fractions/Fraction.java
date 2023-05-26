package OOP_Fractions;

public class Fraction {
    private int numerator;
    private int denominator;

    private static int counter = 0;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {

        return (double) numerator / denominator;

    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction multiply(Fraction b1){
        return new Fraction(b1.getNumerator() * this.numerator, b1.getDenominator() * this.denominator);
    }

    public Fraction multiply(Fraction b1, Fraction b2){
        return this.multiply(b1).multiply(b2);
    }

    public Fraction add(Fraction b2){
        return new Fraction( b2.getNumerator() + this.numerator, b2.getDenominator() + this.denominator);
    }
}
