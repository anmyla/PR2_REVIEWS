package Generics_InfoProfile;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Info<String> name = new Info<>("Max", 1);
        Info<Integer> age = new Info<>(30, 1);
        Info<String> address = new Info<>("Graz", 1);
        Info<LocalDateTime> regis = new Info<>(LocalDateTime.now(), 2);

        Profile profile = new Profile(name, age, address);
        profile.print();
        System.out.println(regis.getData());

    }
}
