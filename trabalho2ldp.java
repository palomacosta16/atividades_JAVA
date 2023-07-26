
//Alunos: Erick Pereira, Marcelo Alexandre, Paloma Costa - TRABALHO 2 / TDSV2023 

import java.util.Scanner;

public class trabalho2ldp {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de discos: ");
        int numDiscos = entrada.nextInt();
        int numMovimentos = hanoi(numDiscos, 'A', 'B', 'C');
        System.out.println("Tempo total: " + numMovimentos + " segundos.");
    }

    public static int hanoi(int n, char origem, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mova o disco " + n + " de " + origem + " para " + destino);
            return 1;
        } else {
            int movimentosAnteriores = hanoi(n - 1, origem, destino, auxiliar);
            System.out.println("Mova disco " + n + " de " + origem + " para " + destino);
            int movimentosPosteriores = hanoi(n - 1, auxiliar, origem, destino);
            return 1 + movimentosAnteriores + movimentosPosteriores; 
        }
    }
}