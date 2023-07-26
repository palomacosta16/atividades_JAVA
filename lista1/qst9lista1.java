/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author palom
 */ 
import javax.swing.JOptionPane;
public class qst9lista1 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        int diferenca = Math.abs(numero1 - numero2);

        if (diferenca > 10) {
            JOptionPane.showMessageDialog(null, "A diferença entre os números é maior que 10.");
        } else {
            JOptionPane.showMessageDialog(null, "A diferença entre os números é menor ou igual a 10.");
        }
    }
}

