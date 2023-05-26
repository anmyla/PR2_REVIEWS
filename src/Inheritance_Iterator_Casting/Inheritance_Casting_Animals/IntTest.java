package Inheritance_Iterator_Casting.Inheritance_Casting_Animals;

public class IntTest {
    public static void main(String[] args) {
        int a1 = 12;
        Integer a2 = new Integer(13); //komplexer reference typ
        Integer a3 = 14; // es passiert eigentlich automatisch das in der zeile

        System.out.println(a1);
        System.out.println(a2);

        String test = "55";
        System.out.println(test+"5");
        int testAlsZahl = Integer.parseInt(test);
        System.out.println(testAlsZahl+5);
    }
}
