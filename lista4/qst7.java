
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author palom
 */
public class qst7 {
     public static void main(String[] args) {
        int[] numeros = new int[10];
        // 10 n p/ usuario
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (1 + i) + " numero: "));
        }
        // maior e o menor valor
        int maior = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 10; i++) {
              if (numeros[i] > maior)
        maior = numeros[i];
              if (numeros[i] < menor)
              menor = numeros[i];
    JOptionPane.showMessageDialog(null, "O maior numero e: " + maior + "\nO menor numero e: " + menor);
}
     }
}

           
       

