package sec02.exam01;

class A {}

class B extends A {}
class C extends B {}

class D extends B {}
class E extends C {}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();

        B b1 = d;
        C c1 = e;

        // B b3 = d; //B와 E는 상속 관계가 없음
        // C c2 = e; //C와 D는 상곡 관계가 없음
    }
}