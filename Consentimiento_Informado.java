package proyecto_final;

/**Grupo 4
 * María Molina Prado Cuenta: 202110010183
 * Iveth Cristina Herrera Castillo Cuenta: 201720110246
 * MagdaJeaquelin López Cuenta: 202210060450.
 */
public class Consentimiento_Informado {
    private String firmaPaciente;
    private String riesgosBeneficios;
    
    public Consentimiento_Informado(String firmaPaciente, String riesgosBeneficios){
        this.firmaPaciente = firmaPaciente;
        this.riesgosBeneficios = riesgosBeneficios;
    }
    
    public String getFirmaPaciente(){
        return firmaPaciente;
    }
    public String getRiesgosBeneficios(){
        return riesgosBeneficios;
    }
    
    public void setFirmaPaciente(String firmaPaciente){
        this.firmaPaciente = firmaPaciente;
    }
    public void setRiesgosBeneficios(){
        this.riesgosBeneficios = riesgosBeneficios;
    }
}
