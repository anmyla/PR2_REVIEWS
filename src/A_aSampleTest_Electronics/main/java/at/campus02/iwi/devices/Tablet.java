package A_aSampleTest_Electronics.main.java.at.campus02.iwi.devices;

public class Tablet extends Device {
    private boolean arCamera;

    public Tablet(String name, Processor processor, int releasedYear, int nrProduced, boolean arCamera) {
        super(name, processor, releasedYear, nrProduced);
        this.arCamera = arCamera;
    }

    public boolean isArCamera() {
        return arCamera;
    }

    public void setArCamera(boolean arCamera) {
        this.arCamera = arCamera;
    }

    @Override
    public double calculateProductionCost() {
     /*   double productionCost = 0;
        double processorCost = 0;

        int generation = getProcessor().getGeneration();
        int core = getProcessor().getNrCores();


        if ((!(generation <= 0)) && (generation == 1) && (core > 2)) {
            processorCost = 200;
        } else if ( generation == 1 && core == 1) {
            processorCost = 150;
        } else if (generation == 2 && core <= 3) {
            processorCost = 350;
        } else if ((generation == 2) && (core > 4) && (core <=7)) {
            processorCost = 400;
        } else if (generation == 2 && core >= 8) {
            processorCost = 450;
        } else{
            processorCost = 700;
        }
        productionCost = (50 + processorCost) * getNrProduced();
        return productionCost;
        */

        double result = 700;
        switch(getProcessor().getGeneration()){
            case 1:
                if(getProcessor().getNrCores() == 1){
                    result = 150;
                }else{
                    result = 200;
                }
                break;
            case 2:
                if(getProcessor().getNrCores() >= 8){
                    result = 450;
                }else{
                    if(getProcessor().getNrCores() >= 4){
                        result = 400;
                    }else{
                        result = 350;
                    }
                }
                break;
        }

        if(arCamera){
            result += 50;
        }
        return result * getNrProduced();
    }

    @Override
    public double calculateSupportCostForAYear(int year) {
        int nrOfYear = year - getReleaseYear();
        double supportCostForAYear = getNrProduced() * (50 * (1 - nrOfYear * 0.1));

/*------MY VERY LONG SOLUTION returns the right value but it is not sexy

            switch (nrOfYear) {
            case 0: return supportCostForAYear = (50 * 1) * getNrProduced();
            case 1: return supportCostForAYear = (50 * .9) * getNrProduced();
            case 2: return supportCostForAYear = (50 * .8) * getNrProduced();
            case 3: return supportCostForAYear = (50 * .7) * getNrProduced();
            case 4: return supportCostForAYear = (50 * .6) * getNrProduced();
            case 5: return supportCostForAYear = (50 * .5) * getNrProduced();
            case 6: return supportCostForAYear = (50 * .4) * getNrProduced();
            case 7: return supportCostForAYear = (50 * .3) * getNrProduced();
            case 8: return supportCostForAYear = (50 * .2) * getNrProduced();
            case 9: return supportCostForAYear = (50 * .1) * getNrProduced();
            default: return (0 * getNrProduced());
        }*/
        return supportCostForAYear;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : " + getName() + " : " + getNrProduced();
    }

}