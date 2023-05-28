package A_CheatSheet;

public class Object {

    //JUST DUMMY ATTRIBUTES
    Integer hashKey;
    String hashValue;

    Day day;

    public Object(Integer hashKey, String hashValue) {
        this.hashKey = hashKey;
        this.hashValue = hashValue;
    }

    public Object(String hashValue, int hashHey) {
        this.hashValue = hashValue;
        this.hashKey = hashHey;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    //JUST DUMMY METHODS
    public int valueYouAreSearchingFor() {
        return 1+1;
    }

    public String getHashValue() {
        return hashValue;
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }

    public int getHashKey() {
        return hashKey;
    }

    public void setHashHey(int hashHey) {
        this.hashKey = hashKey;
    }
}
