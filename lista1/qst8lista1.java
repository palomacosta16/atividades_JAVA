/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author palom
 */   
import javax.swing.JOptionPane;
public class qst8lista1 {

    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        double diferenca = numero1 - numero2;
        
        JOptionPane.showMessageDialog(null, "A diferença entre os números é: " + diferenca);
    }
}

