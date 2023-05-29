package A_aSampleTest.main.java.at.campus02.iwi.devices;

public class Smartwatch extends Device {
    private int nrWristSizes;

    public Smartwatch(String name, Processor processor, int releasedYear, int nrProduced, int nrWristSizes) {
        super(name, processor, releasedYear, nrProduced);
        this.nrWristSizes = nrWristSizes;
    }

    public int getNrWristSizes() {
        return nrWristSizes;
    }

    public void setNrWristSizes(int nrWristSizes) {
        this.nrWristSizes = nrWristSizes;
    }

    @Override
    public double calculateProductionCost() {
        double productionCost;
        double pricePerPiece;

        if (nrWristSizes <= 1) {
            pricePerPiece = 100;
        }
        else {
            pricePerPiece = 100 + ((nrWristSizes-1) * 10);
        }

        productionCost = pricePerPiece * getNrProduced();

        return productionCost;
    }

    @Override
    public double calculateSupportCostForAYear(int year) {
        double supportCostForAYear = 0;
        return supportCostForAYear = (getProcessor().getNrCores() * 10) * getNrProduced();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : " + getName() + " : " + getNrProduced();
    }

}