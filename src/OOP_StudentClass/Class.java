package OOP_StudentClass;

public class Class {
    private String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudents;

    public Class(String name, int hours, int maxCapacity) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        enrolledStudents = 0;
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

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    @Override
    public String toString() {
        return "Class name: " + name;
    }

    public void enrollStudent() {
        this.enrolledStudents++;
    }
/*
    public boolean maxCapacityReached() {
        return enrolledStudents >= maxCapacity;
    }

 */
}