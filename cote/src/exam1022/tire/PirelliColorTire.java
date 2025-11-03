package exam1022.tire;

public class PirelliColorTire extends ColorTire {
    protected String brand = "Pirelli";

    public PirelliColorTire(int maxRoll, String color) {
        this.maxRoll = maxRoll;
        this.color = color;
    }

    @Override
    public boolean Roll() {
        nowRoll++;
        if (nowRoll > maxRoll) {
            System.out.println(brand+"color" + "펑크");
            return false;
        } else  {
            return true;
        }
    }

    public String getBrand() {
        return brand;
    }
}
