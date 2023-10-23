package ExceptionTest;

public class Main {

    public static void main(String[] args) {
         ExceptionJava exceptionJava = new ExceptionJava(3000);
        try {
            exceptionJava.truTien(4000);
            System.out.println("Rut tien thanh cong");
            System.out.println(exceptionJava.getSoDu());
        }catch (SodukhongduException sd){
            System.out.println(sd.getMessage());

        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
