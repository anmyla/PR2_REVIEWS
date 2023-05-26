package OOP_Fractions;

public class FractionDemo {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(7,8);

        System.out.println("Fraction to decimal method:  " + fraction.toDecimal());
        fraction.print();

        Fraction fraction1 = new Fraction(1,2);
        fraction1.multiply(fraction1).print();

        Fraction fraction2 = new Fraction(2,6);
        fraction1.multiply(fraction1, fraction2).print();

        Fraction fraction3 = new Fraction (6, 9);
        fraction3.add(fraction3).print();

        System.out.println("Total number of Fractions: " + Fraction.getCounter());
    }
}
