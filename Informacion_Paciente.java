package proyecto_final;

/**Grupo 4
 * María Molina Prado Cuenta: 202110010183
 * Iveth Cristina Herrera Castillo Cuenta: 201720110246
 * MagdaJeaquelin López Cuenta: 202210060450.
 */
public class Informacion_Paciente {
   private String nombre;
   private int edad;
   private String genero;
   private int identidad;
   private String direccion;
   private int telefono;
   private String correo;
   
   public Informacion_Paciente(String nombre, int edad, String genero, int identidad, String direccion,
                                int telefono, String correo){
       this.nombre = nombre;
       this.edad = edad;
       this.genero = genero;
       this.identidad = identidad;
       this.direccion = direccion;
       this.telefono = telefono;
       this.correo = correo;
   }
public String getNombre(){
    return nombre;
}

public int getEdad(){
    return edad;
}

public String getGenero(){
    return genero;
}

public int getIdentidad(){
    return identidad;
}

public String getDireccion(){
    return direccion;
}

public int getTelefono(){
    return telefono;
}

public String getCorreo(){
    return correo;
}

public void setNombre(String nombre){
    this.nombre = nombre;
}

public void setEdad(int edad){
    this.edad = edad;
}

public void setGenero(String genero){
    this.genero = genero;
}

public void setIdentidad(int identidad){
    this.identidad = identidad;
}

public void setDireccion(String direccion){
    this.direccion = direccion;
}

public void setTelefono(int telefono){
    this.telefono = telefono;
}

public void setCorreo(String correo){
    this.correo = correo;
}
}


