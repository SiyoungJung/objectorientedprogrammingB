package exam1105;

import java.util.Scanner;

public class MemoExample {
    public static void main(String[] args) {
       MemoReposistory repository;

       repository = new LocalRepository();

       repository.addMemo("1", "hello world");

       repository = new NetworkRepository();
       repository.addMemo("1", "hello world");
    }
}
