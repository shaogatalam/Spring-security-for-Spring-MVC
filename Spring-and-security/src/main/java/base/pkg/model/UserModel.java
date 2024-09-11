package base.pkg.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import base.pkg.user.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    private String firstName;
    private String lastName;
    private String email;

    @JsonIgnore
    private String password;
    @JsonIgnore
    private String matchingPassword;

    private Role role;

    // getters and setters for role
    public Role getRole() {return role;}

    public void setRole(Role role) {this.role = role;}
}
