/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author palom
 */
public class avaliacao2QST3 {
    public static void main(String[] args) {
        long[] p = new long[50];
        p[0] = 0;
        p[1] = 1;
        System.out.print(p[0]+" "+p[1]+" ");
        for (int n = 2; n < 50; n++) {
            //double p = 2 * Math.pow(n, -1);
            p[n] = 2*p[n-1]+p[n-2];
            System.out.print(p[n]+" ");
        }
    }
}

