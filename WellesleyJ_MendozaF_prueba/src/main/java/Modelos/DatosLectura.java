/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author jellz
 */
public class DatosLectura implements Datos {
    
    private String[][] estudiantes;

    public DatosLectura(String[][] estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public void procesar() {
        for (String[] estudiante : estudiantes) {
            // Lógica para procesar cada estudiante
            // ...
            // Puedes imprimir el nombre y las notas para cada estudiante como un ejemplo
            System.out.println("Estudiante: " + estudiante[0]);
            System.out.println("Notas: " + estudiante[1] + ", " + estudiante[2] + ", " + estudiante[3]);
        }
    }

    // Agregar el método getEstudiantes para obtener la información de estudiantes
    public String[][] getEstudiantes() {
        return estudiantes;
    }
}

