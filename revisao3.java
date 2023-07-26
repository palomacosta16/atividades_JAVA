/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author 05536215132
 */
public class revisao3 {
    //programa que sorteia um num aleatorio. o programa pergunta ao usuario se o num é par ou impar.dps informa se o usuario acertou
    public static void main (String[]args){
        Random gerador = new Random ();
        for(int i = 0; i < 1; i++) {
            int aleatorio = gerador.nextInt(10);
            String[] opcoes = {"par", "impar"} 
               int opcoes  = JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, opcoes, null); //outra possibilidade: resultado = "o valor " +aleatorio+ " é par ou impar?\n";
             if (opcao == JOpationPane.YES_OPTION){
                 if (numAleatorio%2 == 0){
                     JOptionPane.ShowMessageDialog(null,"você acertou");
                 }else {
                     JOptionPane.
                 }
             }

    }
}
}