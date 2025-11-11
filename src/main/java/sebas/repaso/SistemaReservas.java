/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebas.repaso;

/**
 *
 * @author jacks
 */
public class SistemaReservas {

    public String validarReserva(int numeroHabitacion, int diasEstadia, char tipoHabitacion, String codigoDescuento) {
        if (numeroHabitacion < 101 || numeroHabitacion > 999) {
            return "Número de habitación inválido";
        }
        if (diasEstadia < 1 || diasEstadia > 30) {
            return "Días de estadía inválidos";
        }
        if (tipoHabitacion != 'S' && tipoHabitacion != 'D' && tipoHabitacion != 'M') {
            return "Tipo de habitación inválido";
        }
        if (!codigoDescuento.matches("^[a-zA-Z0-9]{8}$") && !codigoDescuento.isEmpty()) {
            return "Código de descuento inválido";
        }
        return "Reserva válida";
    }
}
