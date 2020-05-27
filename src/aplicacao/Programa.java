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

		// "Leitura do financiamento

		System.out.print("Número de prestações:");
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

			System.out.print("O valor total financiado nao pode ser maior que 30% do salário. Tente novamente");
			valorTotalFinanciado = sc.nextDouble();

			valorEntrada = (valorTotalFinanciado * porcentagem) / 100;
			valorFinanciado = valorTotalFinanciado - valorEntrada;
			prestacao = valorFinanciado / numeroPrestacoes;

		}

		// MENU

		int opcaoMenu = 0;
		while (opcaoMenu != 4) {

			System.out.println();
			System.out.println("1 - Mostrar valor da entrada");
			System.out.println("2 - Mostrar o valor financiado");
			System.out.println("3 - Mostrar valor de cada prestação");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opção: ");

			opcaoMenu = sc.nextInt();

			if (opcaoMenu == 1) {

				System.out.println();
				System.out.printf("ENTRADA = R$ %.2f%n", valorEntrada);

			} else if (opcaoMenu == 2) {

				System.out.println();
				System.out.printf("VALOR FINANCIADO = R$ %.2f%n", valorFinanciado);

			} else if (opcaoMenu == 3) {

				System.out.println();
				System.out.printf("VALOR DE CADA PRESTAÇÃO = R$ %.2f%n", prestacao);

			} else if (opcaoMenu == 4) {

				System.out.println();
				System.out.println("FIM DO PROGRAMA!");

			} else {

				System.out.println();
				System.out.println("OPÇÃO INVÁLIDA");

			}

		}

	}

}
