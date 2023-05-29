package A_aSampleTest.main.java.at.campus02.iwi.devices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DeviceDatabase {
    private ArrayList<Device> devices = new ArrayList<>();

    private ArrayList<Processor> processorDB = new ArrayList<>();

    public DeviceDatabase() {
        this.devices = devices;
    }


    public ArrayList getDevices() {
        return devices;
    }
    public ArrayList getProcessor() { return processorDB;}

    public void addDevice(Device item) {
        devices.add(item);
    }

    public double calculateSumOfProductionCosts() {
        double sumOfProductionCosts = 0;
        for (Device item : devices) {
            sumOfProductionCosts = sumOfProductionCosts + item.calculateProductionCost();
        }
        return sumOfProductionCosts;
    }

    public Device findDeviceWithCheapestProductionCost() {
        Device deviceWithCheapestProductionCost = null;
        double cheapestProductionCost = 0;
        double cost = 0;


        for (Device item : devices) {
            cost = item.calculateProductionCost();
            if (deviceWithCheapestProductionCost == null || cost < cheapestProductionCost) {
                deviceWithCheapestProductionCost = item;
                cheapestProductionCost = cost;
            }
        }
        return deviceWithCheapestProductionCost;
    }


    public double calculateSupportCostUntilYear(Device device, int year) {
        double supportCostUntil = 0;
        if (device.getReleaseYear() > year) {
            return 0;
        }

        for (int i = device.getReleaseYear(); i <= year; i++); {
            supportCostUntil = device.calculateSupportCostForAYear(year);
        }
        return supportCostUntil;
    }

    public Device findDeviceWithHighestSupportCostUntil(int year) {
        Device deviceWithTheHighestSupportCost = null;
        double higherSupportCost = 0;
        double cost = 0;

        for (int i = 0; i < devices.size(); i++) {
            cost = calculateSupportCostUntilYear(devices.get(i), year);
            if (cost > higherSupportCost) {
                higherSupportCost = cost;
                deviceWithTheHighestSupportCost = devices.get(i);
            }
        }
        return deviceWithTheHighestSupportCost;
    }


    public ArrayList<Device> findDevicesThatFulfillMinimumPerformance(HashMap<Integer, Integer> minimum) { //where is the hashmap minimum?
        ArrayList<Device> listOfDevicesThatMeetMinPerformance = new ArrayList<>();
        Integer cores;

        for (Device d : devices) {
            cores = minimum.get(d.getProcessor().getGeneration());
            if (cores != null && d.getProcessor().getNrCores() >= cores) {
                listOfDevicesThatMeetMinPerformance.add(d);
            }
        }
        return listOfDevicesThatMeetMinPerformance;
    }


    public HashMap<String, Integer> numberDevicesGroupedByConstructionCost(double lowBorder, double mediumBorder) {
        HashMap<String, Integer> devicesGroupedByConstructionCost = new HashMap<>();
        double pricePerPiece = 0;

        devicesGroupedByConstructionCost.put("low", 0);
        devicesGroupedByConstructionCost.put("medium", 0);
        devicesGroupedByConstructionCost.put("high", 0);

        for (Device item : devices) {
            pricePerPiece = item.calculateProductionCost() / item.getNrProduced();
            if (pricePerPiece < lowBorder) {
                devicesGroupedByConstructionCost.put("low", devicesGroupedByConstructionCost.get("low") + 1);
            } else if (pricePerPiece < mediumBorder) {
                devicesGroupedByConstructionCost.put("medium", devicesGroupedByConstructionCost.get("medium") + 1);
            } else {
                devicesGroupedByConstructionCost.put("high", devicesGroupedByConstructionCost.get("high") + 1);
            }
        }
        return devicesGroupedByConstructionCost;
    }

    /*---------THESE ARE JUST SOME EXTRA METHODS NOT ASKED IN THE SAMPLE TEST----------------*/

    //wrote this extra just to print the contents of the DevciceDB
    public void printDB(ArrayList devices) {
        ArrayList<Device> printThisDB = devices;

        for (Device item : printThisDB) {
            System.out.println(item);
        }
    }

    public void printDBProcessor(ArrayList processor) {
        ArrayList<Processor> printThisDB = processorDB;

        for (Processor item : printThisDB) {
            System.out.println(item);
        }
    }


    //print contents of Hashmap
    public static void printHashmap1(HashMap<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void printHashmap2(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    //Created a database of Processors so that I can create a Hashmap of it
    public void addToProcessorDB(Processor p) {
        processorDB.add(p);
    }

    //This is Created a Hashmap from an ArrayList
    public HashMap<Integer, Integer> processorDBMap(ArrayList<Processor> processorDB) {
        HashMap<Integer, Integer> createdHashMap = new HashMap<>();

        for (Processor processor : processorDB) {
            int key = processor.getGeneration(); //retrieve/extract the first integer
            int value = processor.getNrCores(); //retrieve/extract the second integer
            createdHashMap.put(key, value); //save the retrieved integers to a Hashmap entry
        }
        return createdHashMap;
    }
}
