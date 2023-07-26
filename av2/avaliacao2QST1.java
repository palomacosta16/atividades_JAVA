/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author palom
 */
import java.util.Random;

public class avaliacao2QST1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] sorteio = new int[100];
        for (int i = 0; i < 100; i++) {
            sorteio[i] = r.nextInt(99)+1;
            for(int j = 0; j < i; j++) {
                if(sorteio[i] == sorteio[j]) {
                    sorteio[i] = r.nextInt(99)+1;
                    j = -1;
                }
            }
            System.out.print(sorteio[i] + " ");
        }
    }
}


    
    

