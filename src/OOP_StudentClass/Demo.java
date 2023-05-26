package OOP_StudentClass;
public class Demo {
    public static void main(String[] args) {
        Class c1 = new Class("Programming 2", 20, 2);
        Student s1 = new Student("Ping", "Pong");
        s1.enroll(c1);
        s1.printClasses();
        System.out.println();

        Student s2 = new Student("Bingi", "Bangi");
        s2.enroll(c1);
        s2.printClasses();
        System.out.println();

        Student s3  = new Student("Mixi", "Maxi");
        s3.enroll(c1);
        s3.printClasses();
        System.out.println();

        Student max = new Student("Max", "Mustermann");

        Class pr = new Class("Programmieren 2", 20, 2);
        Class mod = new Class("Modelle", 15, 2);
        Class db = new Class("Datenbanken", 18, 2);
        Class mob = new Class("Mobile Solutions", 20, 2);

        max.enroll(pr);
        max.enroll(mod);
        max.enroll(db);
        // mit dem nächsten enroll() wird auch increaseArray() aufgerufen
        max.enroll(mob);

        Student anna = new Student("Anna", "Maier");
        Student eva = new Student("Eva", "Neumann");

        anna.enroll(pr);
        //
        eva.enroll(pr);

        max.printClasses();

        System.out.println(max);
    }
}