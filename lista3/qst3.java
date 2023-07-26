/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author palom
 */
import javax.swing.JOptionPane;
public class qst3 {
    public static void main(String[] args) {
        int soma = 0;
        int numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: \nDigite ZERO para sair): "));
            soma += numero;
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma);
    }
}

