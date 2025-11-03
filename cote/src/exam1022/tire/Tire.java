package exam1022.tire;

public abstract class Tire {
    protected int maxRoll;
    protected int nowRoll = 0;

    public boolean Roll() {
        nowRoll++;
        if (nowRoll > maxRoll) {
            return false;
        } else  {
            return true;
        }
    }

    public int getNowRoll() {
        return nowRoll;
    }

    public int getMaxRoll() {
        return maxRoll;
    }
}
