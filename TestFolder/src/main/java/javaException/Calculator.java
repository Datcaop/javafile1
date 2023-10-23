package javaException;

public class Calculator {
    public static float divide(float x ,float y ) throws DevidedByZeroException {
        if (y == 0 ){
            throw new DevidedByZeroException(x,y);
        }
        return x/y;
    }
    public static float plus(float x,float y){
        return x+ y;
    }
}
