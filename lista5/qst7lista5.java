/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author palom
 */
import javax.swing.*;
public class qst7lista5 {

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("informe o dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("informe o mes: "));
        
        if ((mes == 12 && dia >=21 ) || (mes == 1) || (mes == 2)|| (mes == 3 && dia < 21) ){
            JOptionPane.showMessageDialog(null,"VERAO ");
            
        } else if ((mes == 3 && dia >= 21 ) || (mes == 4) || (mes == 5)|| (mes == 6 && dia < 21) ){
           JOptionPane.showMessageDialog(null,"outono ");
           
        } else if ((mes == 6 && dia >= 21 ) || (mes == 7) || (mes == 8)|| (mes == 9 && dia < 21) ){
            JOptionPane.showMessageDialog(null,"inverno ");
            
        } else {
           JOptionPane.showMessageDialog(null, "primavera ");
    }      
    }  
}
