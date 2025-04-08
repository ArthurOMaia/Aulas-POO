/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.calculadora;

/**
 *
 * @author IC
 */
public class Calculadora {

    public static void main(String[] args) {
        CalculadoraArea calcArea = new CalculadoraArea();
        System.out.println(calcArea.calcula(2));
        System.out.println(calcArea.calcula(2, 3));
        System.out.println(calcArea.calcula(4.00));
    }
}
