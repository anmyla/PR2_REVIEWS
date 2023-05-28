package A_SampleTest.main.java.at.campus02.iwi.devices;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //declare processors
        Processor c1, c2, c3, c4;
        //initialize processors
        c1 = new Processor("A11", 1, 2);
        c2 = new Processor("A12", 2, 2);
        c3 = new Processor("A12", 2, 6);
        c4 = new Processor("A13", 3, 4);

        //declare 2 tablets
        Tablet t1, t2;
        //initialized tablets
        t1 = new Tablet("t1", c2, 2020, 1000, false);
        t2 = new Tablet("t2", c4, 2021, 10000, true);

        //declare smartPhones
        Smartphone s1, s2;
        //initialize Smartphones
        s1 = new Smartphone("s1", c1, 2019, 100000, 2);
        s2 = new Smartphone("s2", c3, 2021, 1000000, 3);

        //declare Smartwatches
        Smartwatch w1, w2;
        //initialize Smartwatches
        w1 = new Smartwatch("w1", c2, 2020, 1000, 2);
        w2 = new Smartwatch("w2", c3, 2021, 100, 3);

        //Declare Device DB
        DeviceDatabase db;
        //initialized Device DB
        db = new DeviceDatabase();

        //Add devices to the DB
        db.addDevice(s1);
        db.addDevice(s2);
        db.addDevice(t1);
        db.addDevice(t2);
        db.addDevice(w1);
        db.addDevice(w2);

        //-----TEST METHODS-------//
        System.out.println("Printed Contents of the Device DB");
        db.printDB(db.getDevices());

        System.out.print("\nCalculate production cost of this smartphone: ");
        s1.calculateProductionCost();
        System.out.print(s1);

        System.out.print("\nCalculate production cost of this smartwatch: ");
        w1.calculateProductionCost();
        System.out.print(w1);

        System.out.print("\nCalculate production cost of this tablet: ");
        t1.calculateProductionCost();
        System.out.print(t1);

        System.out.print("\nFind the Device with the cheapest Production Cost: ");
        Device test1 = db.findDeviceWithCheapestProductionCost();
        System.out.print(test1);

        System.out.print("\nFind the device with the highest support cost: ");
        test1 = db.findDeviceWithHighestSupportCostUntil(2023);
        System.out.print(test1);


        System.out.println("\nPrint the list showing products grouped by construction cost: ");
        HashMap<String, Integer> list = db.numberDevicesGroupedByConstructionCost(350, 550);
        db.printHashmap2(list);

        //create a DB of processors and then add the previously created processors to it.
        DeviceDatabase processorDB = new DeviceDatabase();
        processorDB.addToProcessorDB(c1);
        processorDB.addToProcessorDB(c2);
        processorDB.addToProcessorDB(c3);
        processorDB.addToProcessorDB(c4);

        //print the Processor database
        System.out.println("\n---Here is the processor database------");
        processorDB.printDBProcessor(processorDB.getProcessor());

        //Create a Hashmap from the ArrayList<Processor> or processorDB
        HashMap<Integer, Integer> minimum = new HashMap<>();
        minimum = processorDB.processorDBMap(processorDB.getProcessor());

        System.out.println("\nFind processors that fulfill minimum performance:");
        db.findDevicesThatFulfillMinimumPerformance(minimum);
        db.printHashmap1(minimum);

    }
}
