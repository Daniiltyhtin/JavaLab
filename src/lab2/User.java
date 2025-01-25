package lab2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;



@AllArgsConstructor
@Builder
@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String country;


}
