package sec04.exam02;

public class KeycodeExample
{
    public static void main(String[] args) throws Exception
    {
        int keyCode;


        keyCode = System.in.read();
        System.out.printf("keyCode: %d\n", keyCode);

        keyCode = System.in.read();
        System.out.printf("keyCode: %d\n", keyCode);

        keyCode = System.in.read();
        System.out.printf("keyCode: %d\n", keyCode);


    }
}
