package Generics_InfoProfile;

public class Profile {
    private Info name;
    private Info age;
    private Info address;

    public Profile(Info name, Info age, Info address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private String checkSecurityLevel(Info info) {
        switch (info.getSecurityLevel()){
            case 1: return "Access allowed: " +info.getData();
            case 2: return "Access nicht allowed! ";
            case 3: return "Record not found.";
            default: return "Status unknown.";
        }
    }
    public void print(){
        System.out.println("Name: ");
        System.out.println("\t" + checkSecurityLevel(name));
        System.out.println("Age: ");
        System.out.println("\t" + checkSecurityLevel(age));
        System.out.println("Address: ");
        System.out.println("\t" + checkSecurityLevel(address));
    }

}
