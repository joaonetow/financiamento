package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Leitura do nome e salario

		String nome;
		double salario, valorTotalFinanciado, porcentagem;
		int numeroPrestacoes;

		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO: ");

		System.out.print("Nome do cliente:");
		nome = sc.nextLine();

		System.out.print("Sal�rio:");
		salario = sc.nextDouble();

		while (salario <= 0) {

			System.out.print("O sal�rio deve ser positivo. Tente novamente");
			salario = sc.nextDouble();

		}

		// "Leitura do financiamento

		System.out.print("N�mero de presta��es:");
		numeroPrestacoes = sc.nextInt();

		System.out.print("Porcentagem de entrada:");
		porcentagem = sc.nextDouble();

		System.out.print("Valor total financiado:");
		valorTotalFinanciado = sc.nextDouble();

		double valorEntrada, valorFinanciado, prestacao;

		valorEntrada = (valorTotalFinanciado * porcentagem) / 100;
		valorFinanciado = valorTotalFinanciado - valorEntrada;
		prestacao = valorFinanciado / numeroPrestacoes;

		while (prestacao > (salario * 30 / 100)) {

			System.out.print("O valor total financiado nao pode ser maior que 30% do sal�rio. Tente novamente");
			valorTotalFinanciado = sc.nextDouble();

			valorEntrada = (valorTotalFinanciado * porcentagem) / 100;
			valorFinanciado = valorTotalFinanciado - valorEntrada;
			prestacao = valorFinanciado / numeroPrestacoes;

		}

	}

}
