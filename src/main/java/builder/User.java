package builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import java.util.List;

@Builder(toBuilder = true) @Getter @ToString
public class User {
    private String firstName;
    private int age;
    private String gender;

    @Singular
    private List<String> occupations;

}