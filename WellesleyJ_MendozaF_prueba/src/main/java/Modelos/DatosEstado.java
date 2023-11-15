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

    public DatosEstado(Datos datos) {
        this.datos = datos;
    }

    @Override
    public void procesar() {
        datos.procesar();
        // Lógica para identificar estado
        identificarEstado();
    }

    private void identificarEstado() {
        // Lógica para verificar el estado de cada estudiante
        // Suponiendo que las notas están en la posición 1, 2 y 3 de la matriz
        for (String[] estudiante : estudiantes) {
            int nota1 = Integer.parseInt(estudiante[1]);
            int nota2 = Integer.parseInt(estudiante[2]);
            int nota3 = Integer.parseInt(estudiante[3]);

            int sumatoria = nota1 + nota2 + nota3;
            
            if (sumatoria < 70) {
                System.out.println(estudiante[0] + " ha reprobado.");
            } else {
                System.out.println(estudiante[0] + " ha aprobado.");
            }
        }
    }
}



