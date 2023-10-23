package ExceptionTest;

public class ExceptionJava {
    private Integer soDu;

    public ExceptionJava(Integer soDu) {
        this.soDu = soDu;
    }

    public void truTien(Integer tientru) throws Exception {
        if (soDu < tientru){
           throw new SodukhongduException("So du khong du de thuc hien giao dich");
        }if (tientru < 0 ){
            throw  new Exception("Vui long nhap so lon hon 0 ");
        }
        soDu = soDu - tientru;

    }

    public Integer getSoDu() {
        return soDu;
    }

    public void setSoDu(Integer soDu) {
        this.soDu = soDu;
    }
}
