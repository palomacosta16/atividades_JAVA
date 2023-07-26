/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author 05536215132
 */
public class revisao2 {
    public static void main (String[]args){
        DecimalFormat df = new DecimalFormat ("0.##");
       double raio = Double.parseDouble(JOptionPane.showInputDialog ("insira o valor do raio "));
    
       double area = Math.PI * Math.pow (raio, 2); //math.pow p/ expoente ex.:raio ao quadrado
       double perimetro = 2 * Math.PI * raio;
       
       JOptionPane.showMessageDialog(null, "area: " +df.format (area)+ " perimetro: " +df.format (perimetro));
        
    }
}

