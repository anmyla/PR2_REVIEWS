package A_Exercise_InterfaceAbstract_Shapes;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(50,24);
        Rectangle r2 = new Rectangle(46,23);
        Rectangle r3 = new Rectangle(78,54);
        Rectangle r4 = new Rectangle(24,15);
        Rectangle r5 = new Rectangle(85,60);
        Rectangle r6 = new Rectangle(92,67);
        Rectangle r7 = new Rectangle(34,30);

        Circle c1 = new Circle(67);
        Circle c2 = new Circle(89);
        Circle c3 = new Circle(40);
        Circle c4 = new Circle(23);
        Circle c5 = new Circle(17);
        Circle c6 = new Circle(54);
        Circle c7 = new Circle(37);

        FigureManager figures = new FigureManager();

        figures.addToList(r1);
        figures.addToList(r2);
        figures.addToList(r3);
        figures.addToList(r4);
        figures.addToList(r5);
        figures.addToList(r6);
        figures.addToList(r7);
        figures.addToList(c1);
        figures.addToList(c2);
        figures.addToList(c3);
        figures.addToList(c4);
        figures.addToList(c5);
        figures.addToList(c6);
        figures.addToList(c7);

        System.out.println("Maximum Perimiter: " + figures.getMaxPerimeter());
        System.out.println("Average Area Size: " + figures.getAverageSizeArea());
        System.out.println("Area By Size Categories: ");
        figures.printHashmap(figures.getAreaBySizeCategories());
    }
}
