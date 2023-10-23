package org.example;

public class AgeCheck {


    public void AgeCheck(int age) throws AgeException {
            if (age  < 19) {
                throw new AgeException("Vui long nhap so lon hon 19");
            }else {
                System.out.println("Success");
            }
    }
}
