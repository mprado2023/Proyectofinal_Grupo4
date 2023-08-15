package proyecto_final;
/**Grupo 4
 * María Molina Prado Cuenta: 202110010183
 * Iveth Cristina Herrera Castillo Cuenta: 201720110246
 * MagdaJeaquelin López Cuenta: 202210060450.
 */
public class Registro_Medicamentos {
    private String medicamentosRecetados;
    private String dosisFrecuencia;
    private String instrucciones;
    
    public Registro_Medicamentos(String medicamentosRecetados, String dosisFrecuencia, String instrucciones){
        this.medicamentosRecetados = medicamentosRecetados;
        this.dosisFrecuencia = dosisFrecuencia;
        this.instrucciones = instrucciones;
    }
    
    public String getMedicamentosRecetados(){
        return medicamentosRecetados;
    }
    public String getDosisFrecuencia(){
        return dosisFrecuencia;
    }
    public String getInstrucciones(){
        return instrucciones;
    }
    
    public void setMedicamentosRecetados(String medicamentosRecetados){
        this.medicamentosRecetados = medicamentosRecetados;
    }
    public void setDosisFrecuencia(String dosisFrecuencia){
        this.dosisFrecuencia = dosisFrecuencia;
    }
    public void setInstrucciones(String instrucciones){
        this.instrucciones = instrucciones;
    }
}
