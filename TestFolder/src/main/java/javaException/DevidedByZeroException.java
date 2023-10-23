package javaException;

public class DevidedByZeroException extends Exception {

    float x ;
    float y ;

    public DevidedByZeroException(float x, float y) {
        this.x = x;
        this.y = y;
    }


}
