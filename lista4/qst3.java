/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author palom
 */
import java.text.DecimalFormat;
import javax.swing.*;

public class qst3 {
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("0.0#");
        double q0 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade inicial da substancia: "));
        double r = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de desintegração da substância: "));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo que se passou em anos: "));

        double q = q0 * Math. exp (-r*t);
        JOptionPane.showMessageDialog(null, "sobraram"+df.format(q)+ "gramas" );
    
    }
    
}
