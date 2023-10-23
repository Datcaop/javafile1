import java.time.LocalDateTime;
import java.util.List;

public class DeliveryOrder extends Order {
    private String address;

    public DeliveryOrder() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "address='" + address + '\'' +
                ", customerName='" + customerName + '\'' +
                ", transactionTime=" + transactionTime +
                ", lineItems=" + lineItems +
                '}';
    }
}
