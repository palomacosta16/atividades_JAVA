/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author palom
 */
public class qst5lista3 {
        public static void main(String[] args) {
        System.out.println("Fahrenheit para Celsius");
        System.out.println("Fahrenheit\tCelsius");
        
        for (int fahrenheit = 0; fahrenheit <= 300; fahrenheit += 30) {
            double celsius = (fahrenheit - 32) * 5 / 9.0;
            System.out.printf("%d\t\t%.2f\n", fahrenheit, celsius);
        }
    }
}
   
