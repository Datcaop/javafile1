import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    protected String customerName ;
    protected LocalDateTime transactionTime;
    protected List<LineItem> lineItems = new ArrayList<>();


    public Order() {

    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    @Override
    public String toString() {
        return
                "customerName:" + customerName + '\n' +
                " transactionTime:" + transactionTime +'\n'+
                " lineItems:" + lineItems ;
    }

    public Double cost(){
        Double sum = 0.0;
        for (int i = 0 ;i < lineItems.size();i++){
            sum += lineItems.get(i).cost();
        }
        return sum;
    }

    public Boolean addProduct(Product product,Integer quantity){

    }


}
