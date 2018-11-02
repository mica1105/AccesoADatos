
package accesoadatos.modelo;


public class Materia {
    private int id_Materia;
    private String nombre;

    public Materia(int id_Materia, String nombre) {
        this.id_Materia = id_Materia;
        this.nombre = nombre;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }


    public int getId_Materia() {
        return id_Materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId_Materia(int id_Materia) {
        this.id_Materia = id_Materia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
          
            
}
