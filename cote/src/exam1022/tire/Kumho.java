package exam1022.tire;

public class Kumho extends Tire {
    protected String brand = "Kumho";
    public Kumho(int maxRoll) {
        this.maxRoll = maxRoll;
    }

    @Override
    public boolean Roll() {
        nowRoll++;
        if (nowRoll > maxRoll) {
            System.out.println(brand + "펑크");
            return false;
        } else  {
            return true;
        }
    }

    public String getBrand() {
        return brand;
    }
}
