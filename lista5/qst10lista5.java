
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author palom
 */
public class qst10lista5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor a ser financiado: ");
        double valorFinanciado = scanner.nextDouble();

        System.out.print("Digite a taxa de juros ao mês: ");
        double taxaJuros = scanner.nextDouble();
        
        DecimalFormat df = new DecimalFormat("0.0");

        for (int meses = 1; meses <= 10; meses++) {
            double valorParcela = calcularValorParcela(valorFinanciado, taxaJuros, meses);
            System.out.println("Plano " + meses + ": Parcela de R$" + valorParcela + " em " + meses + " meses.");
        }

        scanner.close();
    }

    public static double calcularValorParcela(double valorFinanciado, double taxaJuros, int meses) {
        double taxa = taxaJuros / 100;
        double valorParcela = valorFinanciado * (taxa / (1 - Math.pow(1 + taxa, -meses)));
        return valorParcela;
    }
}
        

