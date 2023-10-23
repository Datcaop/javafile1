package org.example;

public class TransactionMain {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            System.out.println(a);
        }catch (ArithmeticException ae){
            System.out.println("lỗi chia cho 0");
        }
    }

}
