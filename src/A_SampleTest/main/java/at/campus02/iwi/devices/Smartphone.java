package A_SampleTest.main.java.at.campus02.iwi.devices;

public class Smartphone extends Device {
    private int nrCameras;

    public Smartphone(String name, Processor processor, int releasedYear, int nrProduced, int nrCameras) {
        super(name, processor, releasedYear, nrProduced);
        this.nrCameras = nrCameras;
    }

    public int getNrCameras() {
        return nrCameras;
    }

    public void setNrCameras(int nrCameras) {
        this.nrCameras = nrCameras;
    }

    @Override
    public double calculateProductionCost() {
        double volumeDiscount;
        int generation = getProcessor().getGeneration();

        if (getNrProduced() >= 100000 && getNrProduced() < 1000000) {
            volumeDiscount = 0.1;
        } else if (getNrProduced() >= 1000000) {
            volumeDiscount = 0.2;
        } else {
            volumeDiscount = 0.0;
        }

        double productionCost = (((nrCameras * 20) + (generation * 100)) * getNrProduced()) * (1 - volumeDiscount) ;
        return productionCost;
    }

    @Override
    public double calculateSupportCostForAYear(int year) {
        int nrOfYear = year - getReleaseYear();
        double supportCostForAYear = 0;

        if (nrOfYear < 2) {
            return supportCostForAYear = 0 * getNrProduced();
        } else  {
            return supportCostForAYear= (getProcessor().getGeneration() * 40) * getNrProduced();
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : " + getName() + " : " + getNrProduced();
    }
}