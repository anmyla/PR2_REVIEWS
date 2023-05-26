package Inheritance_Persons;

public class Address {
    private String street;
    private  int houseNr;
    private String city;
    private int zipCode;

    public Address(String street, int houseNr, String city, int zipCode) {
        this.street = street;
        this.houseNr = houseNr;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNr=" + houseNr +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
