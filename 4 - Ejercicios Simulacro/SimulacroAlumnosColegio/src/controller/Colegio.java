package controller;

import model.Alumno;

import java.util.ArrayList;

public class Colegio {
    ArrayList<Alumno>listadoAlumnos;
    public int contador=0;

    public Colegio() {
        this.listadoAlumnos = new ArrayList<>();
    }

    public Colegio(ArrayList<Alumno> listadoAlumnos) {
        this.listadoAlumnos = new ArrayList<>();
    }
    public void listarAlumnos(){
        for (Alumno item  : listadoAlumnos  ) {
            item.mostrarDatos();
            System.out.println("_______________________________");
        }
    }

    public void darAlta(Alumno alumno){
        contador++;
        alumno.setMatricula(contador);
        listadoAlumnos.add(alumno);
    }
    public void calificarAlumno(int matricula, double calificacion){
        for (Alumno item : listadoAlumnos) {
            if (item.getMatricula() == matricula) {
                item.setCalificacion(calificacion);
                break; //
            }
        }
    }

}
