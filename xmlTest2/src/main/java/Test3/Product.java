package Test3;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @JacksonXmlElementWrapper(useWrapping = false)

    private String name ;
    private String sku;
    private String color;
    private String price;
    private String quantity;
    private Categories categories;
}
