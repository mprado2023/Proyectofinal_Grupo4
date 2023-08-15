package proyecto_final;

/**Grupo 4
 * María Molina Prado Cuenta: 202110010183
 * Iveth Cristina Herrera Castillo Cuenta: 201720110246
 * MagdaJeaquelin López Cuenta: 202210060450.
 */
public class Informacion_Medica {
    private String antecedentes;
    private String enfermedades;
    private String medicamentos;
    private String alergias;
    
    public Informacion_Medica(String antecedes, String enfermedades, String medicamentos, String alergias){
        this.antecedentes = antecedentes;
        this.enfermedades = enfermedades;
        this.medicamentos = medicamentos;
        this.alergias = alergias;
    }
    
    public String getAntecedentes(){
        return antecedentes;
    }
    
    public String getEnfermedades(){
        return enfermedades;
    }
    
    public String getMedicamentos(){
        return medicamentos;
    }
    
    public String getAlergias(){
        return alergias;
    }
    
    public void setAntecedentes(String antecedentes){
        this.antecedentes = antecedentes;
    }
    
    public void setEnfermedades(String enfermedades){
        this.enfermedades = enfermedades;
    }
    public void setMedicamentos(String medicamentos){
        this.medicamentos = medicamentos;
    }
    public void setAlergias(String alergias){
        this.alergias = alergias;
        
    }
}
