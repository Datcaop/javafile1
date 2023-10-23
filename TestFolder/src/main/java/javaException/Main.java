package javaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];

        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Nhap vao phan tu [%d] ");
                Scanner sc = new Scanner(System.in);
                arr[i] = sc.nextInt();
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
