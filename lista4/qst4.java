/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author palom
 */  
import javax.swing.JOptionPane;
public class qst4 {

    public static void main(String[] args) {
   
        double velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade de lançamento (m/s): "));
        double angulo = Double.parseDouble(JOptionPane.showInputDialog("Digite o ângulo de lançamento (graus): "));

        double distanciaMaxima = calcularDistanciaMaxima(velocidade, angulo);
        double alturaMaxima = calcularAlturaMaxima(velocidade, angulo);

        JOptionPane.showMessageDialog(null, "Distância máxima alcançada: " + distanciaMaxima + " metros" +
                "\nAltura máxima atingida: " + alturaMaxima + " metros");
    }

    // Função para calcular a distância máxima alcançada
    public static double calcularDistanciaMaxima(double velocidade, double angulo) {
        double radianos = Math.toRadians(angulo);
        double distancia = (velocidade * velocidade * Math.sin(2 * radianos)) / 10;
        return distancia;
    }
    // Função para calcular a altura máxima atingida
    public static double calcularAlturaMaxima(double velocidade, double angulo) {
        double radianos = Math.toRadians(angulo);
        double altura = (velocidade * velocidade * Math.pow(Math.sin(radianos), 2)) / (2 * 10);
        return altura;
    }
}
 

