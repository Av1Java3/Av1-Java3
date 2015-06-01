package main;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{	
		//Criando o objeto da nossa loja que vai alojar todas as informações.
		Loja doom = new Loja();
		int opcao;
		Scanner scan = new Scanner(System.in);
		
		
		//Este bloco do vai criar um objeto carro.
		do
		{
			System.out.println("Digite o numero correspondente a opção desejada");
			System.out.println("1 = Adicionar Veiculo");
			System.out.println("2 = Buscar Veiculo por Chassi");
			System.out.println("4 = Pesquisar Veiculo por parametros");
			System.out.println("5 = Listar Estoque");
			System.out.println("0 = EXIT");
			
			opcao = scan.nextInt();
			
		switch(opcao)
		{
		case 1:
			doom.estoque.add(Sup.addVeiculo());break;
		case 2:
			doom.buscarVeiculo();break;
		case 3:
			doom.buscarVeiculo();break;
		case 4:
			doom.pesquisarEstoque();break;
		case 5:
			doom.listarEstoque();break;
		case 0:
			System.out.println("Yippee ki-yay, motherfucker!");break;
		default:
			System.out.println("Opção inválida. Escolha uma das opções listadas.");
			break;
		}
			
		} while (!(opcao ==0));
	}
}



