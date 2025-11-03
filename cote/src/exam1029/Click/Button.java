package exam1029.Click;

public class Button implements Clickable, Drawable {
    public Button(String label) {
        this.label = label;
    }

    String label;

    public Button() {
    }

    @Override
    public void click() {
        System.out.println("버튼이 클릭됨");
    }

    @Override
    public void draw() {
        if (label != null) {
            System.out.println(label + " 버튼을 그립니다");
        }
    }
}
