/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author palom
 */
import javax.swing.JOptionPane;
public class qst8lista5 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de a?"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de b?"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de c?"));
        double delta = b*b - 4*a*c;
//        double delta = Math.pow(b, 2) - 4*a*c;
        if(delta < 0) {
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais.");
        } else if(delta == 0) {
            double x = -b/(2*a);
            JOptionPane.showMessageDialog(null, "A equação possui uma raíz real: "+x);
        } else if(delta > 0) { // } else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            JOptionPane.showMessageDialog(null, "A equação possui duas raízes reais:\n"+x1+"\n"+x2);
        }
    }
}
