/*
 * Aluno: Carlos Roberto Alves de Almeida Júnior
 * Matrícula: 683471
 */
import java.util.*;
public class SomarDoisNumero {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		int num1, num2, soma;
		System.out.print("Digite um número: ");
		num1 = sc.nextInt();
		System.out.print("Digite outro número: ");
		num2= sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("Soma: " + soma);
	}
}
