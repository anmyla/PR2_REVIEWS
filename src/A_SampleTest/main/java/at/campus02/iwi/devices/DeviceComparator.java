package A_SampleTest.main.java.at.campus02.iwi.devices;

import java.util.Comparator;

public class DeviceComparator implements Comparator<Device> {

    @Override
    public int compare (Device o1, Device o2) {
        //Sorting Criteria Processor's generation
        int result = o1.getProcessor().compareTo(o2.getProcessor());
        if(result != 0) { //this means that processors are not the same
            return result;
        }
        //Processors are the same we have to sort further.
        return Integer.compare(o1.getProcessor().getNrCores(),o2.getProcessor().getNrCores());
    }



}