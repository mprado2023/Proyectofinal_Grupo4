
package proyecto_final;

/**Grupo 4
 * María Molina Prado Cuenta: 202110010183
 * Iveth Cristina Herrera Castillo Cuenta: 201720110246
 * MagdaJeaquelin López Cuenta: 202210060450.
 */
public class Datos_Clinicos {
    private String resultados;
    private String imagenes;
    private String diagnostico;
    private String tratamiento;
    
    public Datos_Clinicos(String resultados, String imagenes, String diagnostico, String tratamiento){
        this.resultados = resultados;
        this.imagenes = imagenes;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

public String getResultados(){
    return resultados;
}
public String getImagenes(){
    return imagenes;
}
public String getDiagnostico(){
    return diagnostico;
}
public String getTratamiento(){
    return tratamiento;
}

public void setResultados(String resultados){
    this.resultados = resultados;
}
public void setImagenes(String imagenes){
    this.imagenes = imagenes;
}
public void setDiagnostico(String diagnostico){
    this.diagnostico = diagnostico;
}
public void setTratamiento(String tratamiento){
    this.tratamiento = tratamiento;
}
}
