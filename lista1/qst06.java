import javax.swing.JOptionPane;

public class qst06{
	public static void main(String[]args){
		String n = JOptionPane.showInputDialog("digite um numero");

		int dobro = Integer.parseInt(n);

		int resultado = 2*dobro;

		System.out.println("o dobro do numero digitado é " + resultado);

	}
}