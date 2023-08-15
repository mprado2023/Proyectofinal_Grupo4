package proyecto_final;

/**Grupo 4
 * María Molina Prado Cuenta: 202110010183
 * Iveth Cristina Herrera Castillo Cuenta: 201720110246
 * MagdaJeaquelin López Cuenta: 202210060450.
 */
public class Informacion_Visita {
    private String fechaVisita;
    private String motivoConsulta;
    private String sintomas;
    
    public Informacion_Visita(String fechaVisita, String motivoConsulta, String sintomas){
        this.fechaVisita = fechaVisita;
        this.motivoConsulta = motivoConsulta;
        this.sintomas = sintomas;
    }
    
    public String getFechaVisita(){
        return fechaVisita;
    }
    public String getMotivoConsulta(){
        return motivoConsulta;
    }
    public String getSintomas(){
        return sintomas;
    }
    
    public void setFechaVisita(String fechaVisita){
        this.fechaVisita = fechaVisita;
    }
    public void setMotivoConsulta(String motivoConsulta){
        this.motivoConsulta = motivoConsulta;
    }
    public void setSintomas(String sintomas){
        this.sintomas = sintomas;
    }
}
