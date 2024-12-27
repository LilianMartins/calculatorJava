package calculator;

import java.util.Scanner;

public class calc {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		double num1, num2, resul;
	
		
		System.out.println("*** Bem vindo a sua calculadora ***");
		
		System.out.println("*** Digite o primeiro número: ***");
		num1 = scanner.nextDouble();
		System.out.println("*** Digite o segundo número: ***");
		num2 = scanner.nextDouble();
		
		System.out.println("Digite a operação: +, -, *, / : ");
		char operador = scanner.next().charAt(0);
		scanner.close();
		
		switch (operador) {
		case '+': 
			resul = num1 + num2;
		break;
		case '-':
		    resul = num1 - num2;
		break;
		case '*':
			resul = num1 * num2;
		break;
		case '/':
			resul = num1 * num2;
		break;
	 default:
		 System.out.println("Operação Inválida!");
		 return;
		 
		}
		
		System.out.println("O resultado entre o número 1: " + num1 + " e entre o número 2: " + num2 + " é: " + resul);
			
		
	}

}
