
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author palom
 */
public class qst6 {
    public static void main(String[] args) {
        Random geraraleatorio = new Random (5);
        for (int i = 0; i < 6; i++) {
            int aleatorio = geraraleatorio.nextInt(10); // Gera um número aleatório entre 0 e 9
            System.out.print(aleatorio);
        
        }
    }
}
