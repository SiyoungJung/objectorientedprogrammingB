package sec01.exam05;

public class Outter {
    String filed = "Outter-field";
    void method() {
        System.out.println("Outter-method.");
    }

    class Nested {
        String field = "Nested-field";
        void method() {
            System.out.println("Nested-method.");
        }
        void print() {
            System.out.println(this.field);
            this.method();
            System.out.println(Outter.this.filed);
            Outter.this.method();
        }
    }
}
