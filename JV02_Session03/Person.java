package Done.JV02_Session03;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    private int number;
    private String name;
    private int age;
    private String gender;
}
