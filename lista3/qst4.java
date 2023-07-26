
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author palom
 */
public class qst4 {
     public static void main(String[] args) {
        String[] operacoes = { "Soma", "Subtração", "Multiplicação", "Divisão" };
        int operacaoSelecionada = JOptionPane.showOptionDialog(null, "Selecione uma operação:", "Calculadora",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, operacoes, operacoes[0]);

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

        double resultado = 0;

        switch (operacaoSelecionada) {
            case 0: // Soma
                resultado = numero1 + numero2;
                break;
            case 1: // Subtração
                resultado = numero1 - numero2;
                break;
            case 2: // Multiplicação
                resultado = numero1 * numero2;
                break;
            case 3: // Divisão
                resultado = numero1 / numero2;
                break;
        }

        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }
}
