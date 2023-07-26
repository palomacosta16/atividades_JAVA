/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author palom
 */
import java.util.ArrayList;
import java.util.Random;

public class qst6lista5 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for(int i = 1; i <= 25; i++) {
            lista.add(i);
        }
        for(int i =0; i < 15; i++) {
            int num = lista.remove(random.nextInt(lista.size()));
            System.out.print(num+" ");
        }
    }
}
