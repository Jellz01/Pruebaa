/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author jellz
 */
public class DatosConteo implements Datos  {
    private Datos datos;

    public DatosConteo(Datos datos) {
        this.datos = datos;
    }

    @Override
    public void procesar() {
        datos.procesar();
        // Lógica para contar aprobados, reprobados, retirados
        // ...
    }
}
    

