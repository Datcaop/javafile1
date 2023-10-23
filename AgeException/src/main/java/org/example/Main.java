package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tuổi");
        int age = sc.nextInt();

        AgeCheck ageCheck = new AgeCheck();

        try {
            ageCheck.AgeCheck(age);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

    }


}