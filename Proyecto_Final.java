package proyecto_final;

/**Grupo 4
 * María Molina Prado Cuenta: 202110010183
 * Iveth Cristina Herrera Castillo Cuenta: 201720110246
 * MagdaJeaquelin López Cuenta: 202210060450.
 */
public class Proyecto_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Aqui estamos mandado a llamar la pantalla de datos generales para proyectarla.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_Generales().setVisible(true);
            }
        });
    }

}
