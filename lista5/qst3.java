/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista5;
import java.util.*;

public class qst3 {

    //public static void main(String[] args) {
       //Scanner primos = new Scanner (System.in);
      // System.out.println ("insira um numero inteiro");
       //int numero  = primos.nextInt();
       
       //System.out.println ("insira um numero inteiro");

    public static void main(String[] args) {
        Scanner primos = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = primos.nextInt();
        int divisor = 2;
        while (numero > 1) {
            while (numero % divisor == 0) {
                System.out.print(divisor + " ");
                numero /= divisor;
            }
            divisor++;
        }
    }
}

