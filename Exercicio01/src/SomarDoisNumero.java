/*
 * Aluno: Carlos Roberto Alves de Almeida J�nior
 * Matr�cula: 683471
 */
import java.util.*;
public class SomarDoisNumero {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		int num1, num2, soma;
		System.out.print("Digite um n�mero: ");
		num1 = sc.nextInt();
		System.out.print("Digite outro n�mero: ");
		num2= sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("Soma: " + soma);
	}
}
