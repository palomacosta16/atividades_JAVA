
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author palom
 */
public class qst9lista3 {
    public static void main(String[] args) {
        int valorUm = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
        int valorDois = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número:"));
        int valorTres = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro número:"));
        
        int valorMaior = valorUm; // Inicialmente, assumimos que o primeiro valor é o maior
        
        if (valorDois > valorMaior) {
            valorMaior = valorDois; // Atualizamos o valorMaior se o segundo valor for maior
        }
        
        if (valorTres > valorMaior) {
            valorMaior = valorTres; // Atualizamos o valorMaior se o terceiro valor for maior
        }
        
        JOptionPane.showMessageDialog(null, "O maior valor é: " + valorMaior);
    }
}
