package sec01.exam01;

public class A {
    A() {
        System.out.println("A객체가 생성됨");
    }

    public class B {
        B() {
            System.out.println("B 객체가 생성됨");
        }
    }

    static  class C {
        C() {
            System.out.println("C객체가 생성됨");
        }
    }

    void method() {
        class D {
            D() {
                System.out.println("D객체가 생성됨");
            }
            int field1;
            void method1() {}
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
