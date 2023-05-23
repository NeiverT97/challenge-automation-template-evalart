package co.com.certificacion.retotecnicoavalart.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class ModuleGeneralStept {
    private String userName;
    private String password;

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
