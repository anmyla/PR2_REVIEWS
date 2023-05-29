package A_Exercise_InterfaceAbstract_Shapes;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FigureManager {
    ArrayList<Figure> listOfFigures;

    public FigureManager() {
        this.listOfFigures = new ArrayList<>();
    }

    public void addToList(Figure a) {
        listOfFigures.add(a);
    }

    public double getMaxPerimeter() {
        double maxPerimeter = 0;
        double temp = 0;

        for (Figure item : listOfFigures) {
            temp = item.getPerimeter();
            if (temp > maxPerimeter) {
                maxPerimeter = temp;
            }
        }
        return maxPerimeter;
    }

    public double getAverageSizeArea() {
        double totalArea = 0;
        int counter = 0;

        for (Figure item : listOfFigures) {
            totalArea = totalArea + item.getArea();
            counter++;
        }
        return totalArea / counter;
    }

    public HashMap<String, Double> getAreaBySizeCategories() {
        HashMap<String, Double> areaBySizeCategories = new HashMap<>();
        double smallSum = 0;
        double mediumSum = 0;
        double largeSum = 0;

        for (Figure figure : listOfFigures) {
            double area = figure.getArea();
            if (area < 1000) {
                smallSum += area;
            } else if (area >= 1000 && area <= 4999) {
                mediumSum += area;
            } else if (area >= 5000) {
                largeSum += area;
            }
        }
        areaBySizeCategories.put("Klein", smallSum);
        areaBySizeCategories.put("Mittel", mediumSum);
        areaBySizeCategories.put("Groß", largeSum);

        return areaBySizeCategories;
    }

    public static void printHashmap(HashMap<String, Double> map) {
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
