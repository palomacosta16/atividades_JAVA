
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author palom
 */
public class avaliacao2QST2 {
    public static void main(String[] args) {
        double soma = 0;
        for (int n = 0; n < 1000000; n++) {
            soma +=Math.pow(-1, n)*1/Math.pow(2*n+1,2);
        }
        double G = 1*soma;
        JOptionPane.showMessageDialog(null, "Catalan: "+G);
    }
}
        

