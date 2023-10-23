import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("F523","Tomato","Food",1.5,589);
        Product product2 = new Product("A763","Zara Shirt","Appearance",12.0,90);
        Product product3 = new Product("H320","Kitchen Table","House Hold",299.0,13);
        Product product4 = new Product("E092","Iphone","Electronic",1000.0,4);
        Product product5 = new Product("S108","Football","Sport",19.9,2);


        Order order = new Order();
        order.setCustomerName("Mike Tyson");
        order.setTransactionTime(LocalDateTime.of(2023,8,8,11,30,0));
        LineItem lineItem1 = new LineItem(product1,5);

        LineItem lineItem2 = new LineItem(product4,2);

        LineItem lineItem3 = new LineItem(product5,4);




        order.getLineItems().add(lineItem1);
        System.out.println("Item 1:");
        System.out.println(lineItem1.cost());
        System.out.println("Success");
        order.getLineItems().add(lineItem2);
        System.out.println("Item 2:");
        System.out.println(lineItem2.cost());
        System.out.println("Success");
        order.getLineItems().add(lineItem3);
        System.out.println("Item 3:");
        System.out.println(lineItem3.cost());
        System.out.println("Success");

        System.out.println("Your total bill :");
        System.out.println(order);
        System.out.println("Total cost:");
        System.out.println(order.cost());


        DeliveryOrder deliveryOrder = new DeliveryOrder();
        deliveryOrder.setCustomerName("Chris Evans");
        deliveryOrder.setTransactionTime(LocalDateTime.of(2023,8,9,13,14,0));
        deliveryOrder.setAddress("123 Cau Giay");
    }
}