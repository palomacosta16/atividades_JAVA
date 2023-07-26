/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trab1;

import javax.swing.JOptionPane;
public class Trab1 {
//ALUNOS: Erick Pereira, Marcelo Alexandre,Paloma Costa | TDSV2023 
    
public static void main(String[]args){

	float valor; //valorprodutos
        float troco = 0;
        float valorDesconto;
        float soma = 0; 
        
        String[] opcoesPagamento = {"Dinheiro", "Cheque", "Cartão de crédito"};
        //int opcaoPagamento;
	do{
            valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do produto:  \n para sair digite zero."));			
            soma += valor;                    
	}
            while( valor != 0);
              JOptionPane.showMessageDialog(null,soma);
                int opcaoPagamento = JOptionPane.showOptionDialog(null, "Escolha a forma de pagamento:", "Pagamento",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesPagamento, opcoesPagamento[0]);
                //dinheiro
                if(opcaoPagamento == JOptionPane.YES_OPTION) {                  
               valorDesconto = (float) (soma - (soma * 0.1));   
            JOptionPane.showMessageDialog(null, "Valor a pagar com desconto: " +valorDesconto);
            
             valor = Float.parseFloat (JOptionPane.showInputDialog(null, "Valor pago cliente"));
             
             troco = (float) (valor - valorDesconto);
             
             JOptionPane.showMessageDialog(null, "Seu troco é:" +troco);

            // Cheque
            } else if (opcaoPagamento == 1) { 
            String[] opcoesCheque = {"Cheque em 1 vez", "Parcelar em 2 vezes", "Parcelar em 3 vezes"};
                int opcaoCheque = JOptionPane.showOptionDialog(null, "Escolha a opção de pagamento:", "Pagamento com cheque",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesCheque, opcoesCheque[0]);
            
            if (opcaoCheque == 0) {
                //parcelamentoemumavez(com5desconto)
                valorDesconto = (float) (soma - (soma * 0.1));   
                 JOptionPane.showMessageDialog(null, "valor da parcela com 10% de desconto:" + String.format("%.2f",valorDesconto ));
                 
                //parcelamentoemduasvezes
             }else if (opcaoCheque == 1) {
                    float parcelamento = soma /2;  
                    JOptionPane.showMessageDialog(null, "valor da parcela:" + String.format("%.2f", parcelamento ));
                    
                //parcelamentoemtresvezes
                } else if (opcaoCheque == 2){
                    float parcelamento = soma /3;
                    JOptionPane.showMessageDialog(null, "valor da parcela:" + String.format("%.2f", parcelamento ));
 
        } else if(opcaoPagamento == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "CC ");
        }
           //cartão
           } else if (opcaoPagamento == 2) { 
            String[] opcoesCartao= {"1 x", "2 x", "3 x", "4x", "5x", "6x", "7x", "8x", "9x", "10x"};
                int opcaoCartao = JOptionPane.showOptionDialog(null, "Escolha a opção de pagamento:", "Pagamento com cartão",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesCartao, opcoesCartao[0]);
                 for (int i = 1; i <= 10; i++) {
        if (opcaoCartao == i - 1) {
            float parcelament = soma / i;
            JOptionPane.showMessageDialog(null, "valor da parcela:" + String.format("%.2f", parcelament));
        }
    }
    }  
}
}
             //até tentamos assim, mas não funcionou kkkk    
            /* if (opcaoCartao == 0) {
                //1x
                float parcelament = soma;
                //2x
            } else if (opcaoCartao == 1) {
                float parcelament = soma /2;
                
            } else if (opcaoCartao == 2) {
                float parcelament = soma /3;
                
            } else if (opcaoCartao == 3) {  
                float parcelament = soma /4;
                
            } else if (opcaoCartao == 4) {
                float parcelament = soma /5;
                
            } else if (opcaoCartao == 5) {  
                float parcelament = soma /6;
                
            } else if (opcaoCartao == 6) {
                float parcelament = soma /7;
                
            } else if (opcaoCartao == 7) {  
                float parcelament = soma /8;
                
            } else if (opcaoCartao == 8) {
                float parcelament = soma /9;
                
            } else if (opcaoCartao == 9) {  
                float parcelament = soma /10;

                JOptionPane.showMessageDialog(null, "valor da parcela:" + String.format("%.2f", parcelament));*/
   
