/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebas.repaso;

/**
 *
 * @author jacks
 */
public class ejercicio01 {

    public int calcularBonificacion(int ventas, int aniosServicio) {
        int bonificacion = 0;

        if (ventas > 0 && aniosServicio >= 0) {

            for (int i = 0; i < aniosServicio; i++) {
                bonificacion += 100;
            }

            if (ventas > 50000) {
                bonificacion += 500;
            }
        } else {
            bonificacion = -1;
        }

        return bonificacion;
    }
}
