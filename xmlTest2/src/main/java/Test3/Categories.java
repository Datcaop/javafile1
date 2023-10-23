package Test3;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;
@Data
public class Categories {
    @JacksonXmlElementWrapper(useWrapping = false)
    List<Category> categories;
}
