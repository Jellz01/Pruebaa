/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author jellz
 */



    public class DatosEstado implements Datos {
    private Datos datos;
    private int aprobadosContador;
    private int reprobadosContador;
    private int retiradosContador;

    public DatosEstado(Datos datos) {
        this.datos = datos;
        this.aprobadosContador = 0;
        this.reprobadosContador = 0;
        this.retiradosContador = 0;
    }

    
   public void procesar() {
        datos.procesar();
        identificarEstado();
    }
        
    private void identificarEstado() {
        String[][] estudiantes = ((DatosLectura) datos).getEstudiantes();

        for (String[] estudiante : estudiantes) {
            int nota1 = Integer.parseInt(estudiante[1]);
            int nota2 = Integer.parseInt(estudiante[2]);
            int nota3 = Integer.parseInt(estudiante[3]);

            int sumatoria = nota1 + nota2 + nota3;

            if (sumatoria == 0) {
                System.out.println(estudiante[0] + " se ha retirado");
                retiradosContador++;
            } else if (sumatoria < 70) {
                System.out.println(estudiante[0] + " ha reprobado");
                reprobadosContador++;
            } else {
                System.out.println(estudiante[0] + " ha aprobado.");
                aprobadosContador++;
            }
        
        }
        
    }
    public int getAprobadosContador()
    {
        return aprobadosContador;
    }
    public int getReprobadosContador()
    {
        return reprobadosContador;
    }
    public int getRetiradosContador()
    {
        return retiradosContador;
    }
    

    
}
