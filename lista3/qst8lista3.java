/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author palom
 */
import javax.swing.JOptionPane;
public class qst8lista3 {
    public static void main(String[] args) {
        int quantidadeNumeros = 10;
        int[] numeros = new int[quantidadeNumeros];

        // Receber os números do usuário
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
        }
        // Identificar os números maiores que o último valor
        int ultimoValor = numeros[quantidadeNumeros - 1];
        String numerosMaiores = "";
        for (int i = 0; i < quantidadeNumeros - 1; i++) {
            if (numeros[i] > ultimoValor) {
                numerosMaiores += numeros[i] + " ";
            }
        }
        // Exibir os números maiores que o último valor
        String mensagem = numerosMaiores.equals("") ? "Não há números maiores que o último valor." :
                "Os números maiores que o último valor são: " + numerosMaiores;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

