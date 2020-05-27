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

		System.out.print("Salário:");
		salario = sc.nextDouble();

		while (salario <= 0) {

			System.out.print("O salário deve ser positivo. Tente novamente");
			salario = sc.nextDouble();

		}

	}

}

