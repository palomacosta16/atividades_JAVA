/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author palom
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class qst9lista5 extends JFrame {
    JLabel rotulo1 = new JLabel("valor de deposito fixo mensal");
    JTextField campo1 = new JTextField(5);
    
    JLabel rotulo2 = new JLabel("taxa de rendimento");
    JTextField campo2 = new JTextField(5);
    
    JLabel rotulo3 = new JLabel("quantidade de meses que pretende aplicar o dinheiro");
    JTextField campo3 = new JTextField(5);
    
    JButton botao = new JButton(" calcule montante total");
    JLabel rotuloResultado = new JLabel("o montante é: ");
    JTextField campoResultado = new JTextField(5);
    
    public qst9lista5() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(rotulo1);
        add(campo1);
        
        add(rotulo2);
        add(campo2);
        
         add(rotulo3);
        add(campo3);
        
        add(botao);
        add(rotuloResultado);
        add(campoResultado);
        
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {    
                double valorDeposito = Double.parseDouble(campo1.getText());
                double taxaRendimento = Double.parseDouble(campo2.getText());
                int quantidadeMeses  = Integer.parseInt(campo3.getText());

                double montanteTotal = calcularMontanteTotal (valorDeposito, taxaRendimento, quantidadeMeses);
                campoResultado.setText("" +montanteTotal);
            }
        });
    }
        public double calcularMontanteTotal(double valorDeposito, double taxaRendimento, int quantidadeMeses) {
        double montante = valorDeposito;

        for (int i = 0; i < quantidadeMeses; i++) {
            montante += montante * taxaRendimento;
        }

        return montante;
    }
    
    public static void main(String[] args) {
        qst9lista5 janela = new qst9lista5();
        janela.setSize(400, 300);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
    }
}

