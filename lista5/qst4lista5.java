/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class qst4lista5 extends JFrame {
    JLabel rotulo1 = new JLabel("Quantidade de kilobits que faltam ser “baixados”:");
    JTextField campo1 = new JTextField(5);
    JLabel rotulo2 = new JLabel("Taxa de transferencia (em kbps): ");
    JTextField campo2 = new JTextField(5);
    JButton botao = new JButton("Calcular tempo");
    JLabel rotuloResultado = new JLabel("restam: ");
    JTextField campoResultado = new JTextField(5);
    
    public qst4lista5() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(rotulo1);
        add(campo1);
        add(rotulo2);
        add(campo2);
        add(botao);
        add(rotuloResultado);
        add(campoResultado);    
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                long horarioInicial = Long.parseLong (campo1.getText());
                long horarioFinal =  Long.parseLong (campo2.getText());
                
                long tempoGasto = horarioFinal - horarioInicial;
                
                //int num1 = Integer.parseInt;
                //int num2 = Integer.parseInt(campo2.getText());
                //int soma = num1+num2;      
                campoResultado.setText("" + tempoGasto);
           }
        });
    }
    public static void main(String[] args) {
        qst4lista5 janela = new qst4lista5();
        janela.setSize(400, 200);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
} 