package sec02.exam02;

public class Anonymous {
    RemoteControl field = new RemoteControl() {
        @Override
        public void TurnOn() {
            System.out.println("TV를 켭니다");
        }

        @Override
        public void TurnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    void method1() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void TurnOn() {
                System.out.println("Audio를 켭니다");
            }

            @Override
            public void TurnOff() {
                System.out.println("Audio를 끕니다.");
            }
        };
    }

    void method2(RemoteControl rc) {
        rc.TurnOn();
    }
}
