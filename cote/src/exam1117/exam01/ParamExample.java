package exam1117.exam01;

public class ParamExample {
    public static void main(String[] args) {
        int[] array = {0, 1, 2};
        printinfo(array);
        System.out.println("in main " + array[2]);
    }

    public static void printinfo(int[] a) {
        System.out.println(a[2]);
        a[2]++;
        System.out.println(a[2]);
    }
}
