/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebas.repaso;

/**
 *
 * @author jacks
 */
public class FitnessCalculator {

    public int calcularCaloriasQuemadas(String tipoEjercicio, int minutos) {
        if (minutos < 0) {
            throw new IllegalArgumentException("Los minutos no pueden ser negativos");
        }

        int caloriasPorMinuto;

        switch (tipoEjercicio.toLowerCase()) {
            case "cardio":
                caloriasPorMinuto = 10;
                break;
            case "pesas":
                caloriasPorMinuto = 8;
                break;
            case "yoga":
                caloriasPorMinuto = 5;
                break;
            default:
                caloriasPorMinuto = 6;
        }

        return caloriasPorMinuto * minutos;
    }

    public double calcularIMC(double pesoKg, double alturaM) {
        if (pesoKg <= 0 || alturaM <= 0) {
            throw new IllegalArgumentException("El peso y la altura deben ser mayores que cero");
        }
        return pesoKg / (alturaM * alturaM);
    }
}
