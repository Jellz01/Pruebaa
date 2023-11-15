/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author jellz
 */
public class DatosConteo implements Datos {
    private Datos datos;
    private int aprobadosContador;
    private int reprobadosContador;
    private int retiradosContador;

    public DatosConteo(Datos datos) {
        this.datos = datos;
        this.aprobadosContador = 0;
        this.reprobadosContador = 0;
        this.retiradosContador = 0;
    }

    @Override
    public void procesar() {
        datos.procesar();
        

        // Obtener los resultados de DatosEstado
        if (datos instanceof DatosEstado) {
            DatosEstado datosEstado = (DatosEstado) datos;

            // Obtener los contadores de DatosEstado
            aprobadosContador = datosEstado.getAprobadosContador();
            reprobadosContador = datosEstado.getReprobadosContador();
            retiradosContador = datosEstado.getRetiradosContador();
        }

        // Mostrar resultados de los contadores
        System.out.println("Aprobados: " + aprobadosContador);
        System.out.println("Reprobados: " + reprobadosContador);
        System.out.println("Retirados: " + retiradosContador);
    }
}

