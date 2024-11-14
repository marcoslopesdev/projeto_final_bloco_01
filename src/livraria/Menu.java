package livraria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao = 0, codigo = 0;
		String titulo;
		

		while (true) {

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
			System.out.println("|                                             |");
			System.out.println("-----------------------------------------------");

			try {
				System.out.printf("\nENTRE COM A OPÇÃO DESEJADA: ");
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.printf("Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			switch (opcao) {
			case 1:
				System.out.println("\n--- CADASTRAR LIVRO ---\n");

				System.out.println("Digite o título do livro: ");
				titulo = leia.nextLine();

				break;
			case 2:
				System.out.println("\n--- LISTAR TODOS OS LIVROS ---");

				break;
			case 3:
				System.out.println("\n--- BUSCAR LIVRO POR CÓDIGO ---\n");
				
				System.out.printf("Digite o código do livro: ");
				codigo = leia.nextInt();
				
				break;
			case 4:
				System.out.println("\n--- ATUALIZAR DADOS DO LIVRO ---\n");
				
				System.out.printf("Digite o código do livro: ");
				codigo = leia.nextInt();
				
				break;
			case 5:
				System.out.println("\n--- REMOVER LIVRO ---\n");
				
				System.out.printf("Digite o código do livro: ");
				codigo = leia.nextInt();

				break;
			default:
				System.out.println("Opção inválida!\n");

				break;
			}

		}

	}
}