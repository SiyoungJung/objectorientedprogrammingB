package exam1022.tire;

public class TireExample {
    public static void main(String[] args) {
        Tire[] ts = new Tire[4];
        ts[0] = new PirelliColorTire(123000, "red");
        ts[1] = new HanKookWideTire(200000, 320);
        ts[2] = new Kumho(156000);

        while (true) {
            if(ts[0].Roll() == false) {
                break;
            }
            if(ts[1].Roll() == false) {
                break;
            }
            if(ts[2].Roll() == false) {
                break;
            }
        }
    }
}
