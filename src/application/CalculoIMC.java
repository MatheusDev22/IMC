package application;
import java.util.Locale;
import java.util.Scanner;

/**
 * Essa classe � util para fazer o c�lculo do IMC
 * 
 * @author Ben�
 *
 */
public class CalculoIMC {

	/**
	 *  O m�todo principal faz o c�lculo do IMC
	 *  
	 * @param args Receve a entrada de dados da linha de comando
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu peso.....: ");
		double peso = entrada.nextDouble();
		
	//	System.out.println();
		System.out.print("Digite sua Altura...: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.printf("Seu IMC.............: %.2f%n" , imc);
		
	}
}
