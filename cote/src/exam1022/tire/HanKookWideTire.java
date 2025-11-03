package exam1022.tire;

public class HanKookWideTire extends WideTire {
    protected String brand = "HanKook";

    public HanKookWideTire(int maxRoll, int width) {
        this.maxRoll = maxRoll;
        this.width = width;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public boolean Roll() {
        nowRoll++;
        if (nowRoll > maxRoll) {
            System.out.println(brand+"wide" + "펑크");
            return false;
        } else  {
            return true;
        }
    }
}
