/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author 05536215132
 */
//import java.util.*;
import javax.swing.JOptionPane;

public class revisao {
     //programa que receba 10 valores, calcule a media destes valores.Depois mostr quais valores sao maiores que esta media
    public static void main (String[]args){
        int [] valores = new int [10];
        int soma = 0; //para realizar uma soma inicializar com zero
        for (int i = 0; i < valores.length; i++){
           valores[i] = Integer.parseInt (JOptionPane.showInputDialog ("insira um valor: "));
         soma += valores[i]; //soma = soma + array[i];
        }
        float media = soma / 10f; //f é de float, numero ponto flutuante
        //System.out.print("media" +media);
        String resultado = "maiores que a media:\n"; //para imprimir em apenas uma janela em joptionpane
        for (int i = 0; i < valores.length; i++ ){
            if (valores[i] > media){
            //    System.out.println(valores[i]);
                resultado += valores[i]+" ";
            }
        }
        JOptionPane.showMessageDialog(null, resultado);
    }  
}


