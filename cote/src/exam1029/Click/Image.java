package exam1029.Click;

import java.sql.SQLOutput;

public class Image implements Clickable, Drawable {
    String url;
    public Image() {
    }

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void click() {
        System.out.println("그림이 클릭되었습니다");
    }

    @Override
    public void draw() {
        System.out.println(url + " 그림을 그립니다.");
    }
}
