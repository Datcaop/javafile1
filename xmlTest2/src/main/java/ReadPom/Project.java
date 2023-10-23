package ReadPom;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Project {

    @JacksonXmlElementWrapper(useWrapping = false)
    private String modalVersion;
    private String groupId;
    private String artifactId;
    private String version;

    private List<Dependency> dependencies;
    private Properties properties;


}
