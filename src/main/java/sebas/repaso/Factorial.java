/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sebas.repaso;

/**
 *
 * @author PC
 */
public class Factorial {
    
    public static long calcular(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }
        
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        
        return resultado;
    }
}