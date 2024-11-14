package livraria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao = 0, codigo;
		String titulo;
		float preco;

		while (opcao != 6) {
			System.out.println("-----------------------------------------------");
			System.out.println("|                                             |");
			System.out.println("|              LIVRARIA OMNIBUS               |");
			System.out.println("|                                             |");
			System.out.println("-----------------------------------------------");
			System.out.println("|                                             |");
			System.out.println("|      1 - Cadastrar livro                    |");
			System.out.println("|      2 - Listar todos os livros             |");
			System.out.println("|      3 - Buscar livro por código            |");
			System.out.println("|      4 - Atualizar dados do livro           |");
			System.out.println("|      5 - Remover livro                      |");
			System.out.println("|      6 - Sair                               |");
			System.out.println("|                                             |");
			System.out.println("-----------------------------------------------");

			try {
				System.out.print("\nENTRE COM A OPÇÃO DESEJADA: ");
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			switch (opcao) {
			case 1:
				System.out.println("\n--- CADASTRAR LIVRO ---\n");
				
				System.out.print("Digite o título do livro: ");
				titulo = leia.nextLine();
				System.out.print("Digite o código do livro: ");
				codigo = leia.nextInt();
				System.out.print("Digite o preço do livro: ");
				preco = leia.nextFloat();
				leia.nextFloat();

				break;

			case 2:
				System.out.println("\n--- LISTAR TODOS OS LIVROS ---");

				break;

			case 3:
				System.out.println("\n--- BUSCAR LIVRO POR CÓDIGO ---\n");
				System.out.print("Digite o código do livro: ");
				codigo = leia.nextInt();
				leia.nextLine();

				break;

			case 4:
				System.out.println("\n--- ATUALIZAR DADOS DO LIVRO ---\n");
				System.out.print("Digite o código do livro: ");
				codigo = leia.nextInt();
				leia.nextLine();

				break;

			case 5:
				System.out.println("\n--- REMOVER LIVRO ---\n");
				System.out.print("Digite o código do livro: ");
				codigo = leia.nextInt();
				leia.nextLine();

				break;

			case 6:
				System.out.println("\nSaindo do sistema...");
				break;

			default:
				System.out.println("Opção inválida!\n");
				break;
			}
		}

		leia.close();
	}
}
