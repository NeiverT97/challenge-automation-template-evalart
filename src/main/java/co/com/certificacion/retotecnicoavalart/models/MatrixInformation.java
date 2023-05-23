package co.com.certificacion.retotecnicoavalart.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class MatrixInformation {
    private String numMatrix;
    private String sumNum;

    public String getNumMatrix() {
        return numMatrix;
    }
    public String getSumNum() {
        return sumNum;
    }
}
