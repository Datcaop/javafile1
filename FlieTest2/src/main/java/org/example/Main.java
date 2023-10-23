package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        try{
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Enter your number");
                arr[i] = sc.nextInt();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finish 1");
        }




    }
}