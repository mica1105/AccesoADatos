
package accesoadatos;

import accesoadatos.modelo.Alumno;
import accesoadatos.modelo.AlumnoData;
import accesoadatos.modelo.Conexion;
import java.time.LocalDate;





public class AccesoADatos {

  
    public static void main(String[] args){
        Conexion con = new Conexion();
        
        AlumnoData alumnoData = new AlumnoData (con);
        
        Alumno alumno1 = new Alumno("Lopez Karina", LocalDate.of(1976,01, 20), true); 
        
        alumnoData.guardarAlumno(alumno1);
        for(Alumno it: alumnoData.obtenerAlumnos()){
            System.out.println("ID: "+it.getId());
            System.out.println("Nombre: "+it.getNombre());
        }

     alumnoData.borrarAlumno(alumno1.getId());
     
     for(Alumno it: alumnoData.obtenerAlumnos()){
            System.out.println("ID: "+it.getId());
            System.out.println("Nombre: "+it.getNombre());
    }
               
 
}
}