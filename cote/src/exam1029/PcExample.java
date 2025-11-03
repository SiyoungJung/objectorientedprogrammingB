package exam1029;

public class PcExample {
    public static void main(String[] args) {
        PC pc = new PC();
        Usb u1 = new SonDisk();
        Usb u2 = new SonDisk(32);
        Usb u3 = new MockDisk();

        pc.port1 = u1;
        pc.port2 = u3;

        pc.test();
    }
}
