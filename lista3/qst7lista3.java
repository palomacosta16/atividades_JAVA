
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author palom
 */
public class qst7lista3 {
    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        double resultado = 1;

        if (expoente >= 0) {
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }
        } else {
            for (int i = 1; i <= -expoente; i++) {
                resultado /= base;
            }
        }

        JOptionPane.showMessageDialog(null, base + " elevado a " + expoente + " é igual a " + resultado);
    }
}

