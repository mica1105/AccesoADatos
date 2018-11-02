
package accesoadatos.modelo;

public class Cursada {
    private Alumno alumno;
    private Materia materia;
    private int nota;
    private int id_cursada;

    public Cursada(Alumno alumno, Materia materia, int nota, int id_cursada) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        this.id_cursada = id_cursada;
    }

    public Cursada(Alumno alumno, Materia materia, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }


    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public int getNota() {
        return nota;
    }

    public int getId_cursada() {
        return id_cursada;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setId_cursada(int id_cursada) {
        this.id_cursada = id_cursada;
    }
    
    
}
