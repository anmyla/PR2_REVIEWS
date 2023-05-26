package Enum_EnrollmentApp;

public class EnrollStudent {
    private static  int counter = 0;
    private int id = 0;
    private  int nonStaticCounter = 0;
    private String firstName;
    private String lastName;
    private EnrollmentClass[] classes;

    public EnrollStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classes = new EnrollmentClass[3];
        this.id = counter++;
        nonStaticCounter++;
    }

    public int getId() {
        return id;
    }

    public int getNonStaticCounter() {
        return nonStaticCounter;
    }

    public static int getCounter() {
        return counter;
    }

    public void enroll(EnrollmentClass c) {
        if (alreadyEnrolled(c)) {
            return;
        }
        if (!c.maxCapacityReached()) {
            if (classes[classes.length - 1] != null) {
                classes = increaseClassArray();
                classes[classes.length - 1] = c;
            }
            else {
                for (int i = 0; i < this.classes.length; i++) {
                    if (classes[i] == null) {
                    c.enroll();
                    classes[i] = c;
                    break;
                    }
                }
            }
        }
    }

    private boolean alreadyEnrolled(EnrollmentClass c) {
        boolean isEnrolled = false;
        for (int i = 0; i < this.classes.length; i++) {
            if (classes[i] != null) {
                if (this.classes[i].getName().equals(c.getName())) {
                    System.out.println("This student is already registered");
                    isEnrolled = true;
                } else {
                    isEnrolled = false;
                }
            }
        }
        return isEnrolled;
    }

    public void printClasses() {

        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null) {
                System.out.println(classes[i]);
            }
        }

    }

    @Override
    public String toString() {
        return "Student : " +
                "firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'';
    }

    private EnrollmentClass[] increaseClassArray() {
        EnrollmentClass[] temp = new EnrollmentClass[classes.length + 1];
        for (int i = 0; i > classes.length; i++) {
            temp[i] = classes[i];
        }
        return temp;
    }

    public void printStudyDays() {
        System.out.println("Student " + this.lastName + " has classes on : " );
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null) {
                System.out.println(classes[i].getDay() + " (" + classes[i].getName() + " )");
            }
        }
    }
}
