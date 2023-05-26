package Enum_EnrollmentApp;

public class EnrollmentApp {
    public static void main(String[] args) {
        EnrollmentClass c1 = new EnrollmentClass("Programming 2", 20, 2, Day.MONDAY);
        EnrollStudent s1 = new EnrollStudent("Ping", "Pong");
        s1.enroll(c1);
        s1.printClasses();
        System.out.println();

        EnrollStudent s2 = new EnrollStudent("Bingi", "Bangi");
        s2.enroll(c1);
        s2.printClasses();
        System.out.println();

        EnrollStudent s3 = new EnrollStudent("Mixi", "Maxi");
        s3.enroll(c1);
        s3.printClasses();
        System.out.println();

        System.out.println("Total number of students : " + EnrollStudent.getCounter());
        System.out.println("Total number of students : " + s2.getNonStaticCounter());

//        int val = 4;
//        String str = String.valueOf(val);

        //Format ID# to start with "00" using String.format()

        System.out.println("Student's ID#: " + String.format("%03d", s3.getId()));

        EnrollmentClass c2 = new EnrollmentClass("Databank", 15, 5, Day.TUESDAY);
        EnrollmentClass c3 = new EnrollmentClass("Web", 45, 5, Day.WEDNESDAY);

       s1.printStudyDays();


    }
}
