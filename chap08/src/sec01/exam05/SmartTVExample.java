package sec01.exam05;

public class SmartTVExample {
    public static void main(String[] args) {
        SmartTVExample tv = new SmartTVExample();

        RemoteControl rc = tv;
        rc.turnOn();
        Searchable searchable = tv;
        searchable.search("interface");
    }
}
