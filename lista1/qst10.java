import java.util.*;

public class qst10{
    public static void main (String[] args) {
        Scanner temperatura = new Scanner (System.in);
        System.out.println("Informe a temperatura em Farenheit");
        float f = temperatura.nextFloat();
        float c = 5*(f-32)/9;
        System.out.println ("celsius:" +c);
            }
}