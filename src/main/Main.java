package main;

import java.util.Scanner;

import motocicleta.Motocicleta;
import carro.Carro;

public class Main 
{
	public static void main(String[] args) 
	{	
		//Criando o objeto da nossa loja que vai alojar todas as informações.
		Loja doom = new Loja();
		int opcao;
		Carro auxCarro;
		Motocicleta auxMoto;
		Scanner scan = new Scanner(System.in);
		
		
		//Este bloco do vai criar um objeto carro.
		do
		{
			System.out.println("Digite o numero correspondente a opção desejada");
			System.out.println("1 = Adicionar Carro");
			System.out.println("2 = Adicionar Moto");
			System.out.println("3 = Buscar Carro");
			System.out.println("4 = Buscar Moto");
			System.out.println("5 = Listar Carros");
			System.out.println("6 = Listar Motos");
			System.out.println("7 = Pesquisar Carro");
			System.out.println("8 = Pesquisar Moto");
			System.out.println("0 = EXIT");
			
			opcao = scan.nextInt();
			
		switch(opcao)
		{
		case 1:
			doom.estoque.add(doom.adicionarCarro());break;
		case 2:
			doom.estoque.add(doom.adicionarMoto());break;
		case 3:
			doom.buscarCarro();break;
		case 4:
			doom.buscarMotocicleta();break;
		case 5:
			doom.listarEstoquedeCarros();break;
		case 6:
			doom.listarEstoquedeMotos();break;
		case 7:
			doom.pesquisarCarro();break;
		case 8:
			doom.pesquisarMotos();break;
		default:
			System.out.println("Opção inválida. Escolha uma das opções listadas.");
			break;
		}
			
		} while (!(opcao ==0));
	}
}



