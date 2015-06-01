package main;

import java.util.ArrayList;
import java.util.Scanner;

import veiculos.Veiculos;

public class Loja
{

	//Temos valores padrões para esta variáveis.
	String nome = "Doomhammer Motors";
	String endereco = "Rua dos bobos n 0";
	
	//Criando uma ArrayList para os estoques de carros e de motos
	
	ArrayList<Veiculos> estoque;
	
	public Loja()
	{
		estoque = new ArrayList<>();
	}
	
	//fuck this shit i am bored
	public void buscarVeiculo()
	{
		String aux = Sup.addChassi();
		
		for(Veiculos x: estoque)
		{
			if(x.getChassi().equals(aux))
			{
				Sup.printVeiculo(x);
			}
		}
	}
	public void listarEstoque()
	{
		for(Veiculos x : estoque)
		{
			Sup.printVeiculo(x);
		}
	}
	public void pesquisarEstoque()
	{
		Veiculos search = new Veiculos();
		int aux;
		int opcao;
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite o numero correspondente ao parametro que deseja procurar. ");
			System.out.println("1 = Tipo de Veiculo");
			System.out.println("2 = CapTanque (somente Motos)");
			System.out.println("3 = Cilindrada (somente Motos)");
			System.out.println("4 = Cambio (somente carros)");
			System.out.println("5 = Motorizacao (somente carros)");
			System.out.println("6 = Cor");
			System.out.println("7 = Modelo");
			System.out.println("8 = Montadora");
			System.out.println("9 = Tipo");
			System.out.println("10 = Modelo");
			System.out.println("0 = Para pesquisar com os parametros escolhidos");
			
			opcao = scan.nextInt();
			
		switch(opcao)
		{
		case 1:
			search.setMapa("TipoVeiculo", Sup.addTipoVeiculo());break;
		case 2:
			search.setMapa("CapTanque", Sup.addCaptanque());break;
		case 3:
			search.setMapa("Cilindrada", Sup.addCilindrada());break;
		case 4:
			search.setMapa("Cambio", Sup.addCambio());break;
		case 5:
			search.setMapa("Motorizacao", Sup.addMotorizacao());break;
		case 6:
			search.setMapa("Cor", Sup.addCor());break;
		case 7:
			search.setMapa("Modelo", Sup.addModelo());break;
		case 8:
			search.setMapa("Montadora", Sup.addMontadora());break;
		case 9:
			search.setMapa("Tipo", Sup.addTipo());break;
		case 10:
			search.setMapa("Modelo", Sup.addModelo());break;
		case 0:
			System.out.println("Yippee ki-yay, motherfucker!");break;
		default:
			System.out.println("Opção inválida. Escolha uma das opções listadas.");
			break;
		}
			
		} while (!(opcao ==0));
		
		for(Veiculos x : estoque)
		{
			x.getMapa().equals(search.getMapa());
		}
	}
}