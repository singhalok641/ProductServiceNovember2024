package inheritanceTypes.tablePerClass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Instructor extends User {
    private String module;
}
