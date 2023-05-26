package Enum_EnrollmentApp;

public class EnrollmentClass {
    private String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudents;
    private Day day;

    public EnrollmentClass(String name, int hours, int maxCapacity, Day monday) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        this.day = day;
        enrolledStudents = 0;
    }

    public EnrollmentClass(String name, int hours, int maxCapacity) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        enrolledStudents = 0;
    }

    public Day getDay() {
        return day;
    }

    public int enroll() {
        if (!maxCapacityReached()) {
            System.out.println("Student enrolled and entered in the system.");
            enrolledStudents++;
        }
        else if(maxCapacityReached()) {
            System.out.println("Registration denied. System full!");
        }
        return enrolledStudents;
    }

    public boolean maxCapacityReached() {
        boolean maxReached = false;
        if (enrolledStudents == maxCapacity) {
        maxReached = true;}
        else if (enrolledStudents < maxCapacity){
        maxReached = false;
        }
        else {
            maxReached = true;
            }
        return maxReached;
        }


    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Class name: " + name;
    }

}
