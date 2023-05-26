package Generics_InfoProfile;

public class Info<T> {

    private T data;
    private int securityLevel;

    public Info(T data, int securityLevel) {
        this.data = data;
        this.securityLevel = securityLevel;
    }

    public T getData() {
        return data;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }
}
