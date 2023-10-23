package javaException;

public class Test {
    public static void main(String[] args) {

        float sum;
        try {
            sum = Calculator.divide(5,0);
            System.out.println("sum: " + sum);
        } catch (DevidedByZeroException e) {
            e.printStackTrace();
        }

    }



}
