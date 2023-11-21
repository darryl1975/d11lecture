package sg.edu.nus.iss.d11lecture.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String firstName;
    
    private String lastName;

    private String email;
    
}
