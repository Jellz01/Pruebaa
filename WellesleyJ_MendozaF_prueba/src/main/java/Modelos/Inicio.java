/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Modelos;

/**
 *
 * @author jellz
 */
public class Inicio {

    public static void main(String[] args) {
        
         String[][] estudiantes = {
                {"Joseph", "80", "90", "75"},
                {"Fabian", "70", "85", "92"},
                // ... Agrega más estudiantes según sea necesario
        };

        // Crear instancia de DatosLectura con la matriz de estudiantes
        Datos dat = new DatosLectura(estudiantes);

        // Aplicar decoradores
        Datos datosEstado = new DatosEstado(dat);
        Datos datosConteo = new DatosConteo(datosEstado);

        // Procesar el documento final con todas las funcionalidades
        datosConteo.procesar();
    }
}
    

