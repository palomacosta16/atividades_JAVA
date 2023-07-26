
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author palom
 */
public class qst6lista3 {
    public static void main(String[] args) {
        double soma = 0;

        for (int i = 1; i <= 7; i++) {
            String input = JOptionPane.showInputDialog("Digite a cotação do dólar no dia " + i + ":");
            double cotacao = Double.parseDouble(input);
            soma += cotacao;
        }

        double media = soma / 7;

        JOptionPane.showMessageDialog(null, "A média da cotação do dólar na última semana é: " + media);
    }
}
