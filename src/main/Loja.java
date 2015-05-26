package main;

import java.util.ArrayList;
import java.util.Scanner;

import motocicleta.Motocicleta;
import motocicleta.SpecsMoto;
import veiculos.Veiculos;
import carro.Carro;
import carro.SpecsCarro;

public class Loja
{

	//Temos valores padrões para esta variáveis.
	String nome = "Doomhammer Motors";
	String endereco = "Rua dos bobos n 0";
	
	//Criando uma ArrayList para os estoques de carros e de motos
	
	ArrayList<Veiculos> estoque = new ArrayList<>();
	
	
	public Carro adicionarCarro()
	{
		//Carro aux adiciona um carro ao estoque.
		SpecsCarro spec = new SpecsCarro();
		Carro aux = new Carro(Sup.addChassi(), Sup.addPreco(),spec);
		return aux;
	}
	public Motocicleta adicionarMoto()
	{		
		//Método para adicionar motos.		
		SpecsMoto spec = new SpecsMoto();
		Motocicleta aux = new Motocicleta(Sup.addChassi(), Sup.addPreco(),spec);
		return aux;
	}
	
	public void listarEstoque() //Métodos para exibir o estoque de carros
	{

		for (Veiculos x: estoque)
		{
			if(x instanceof Carro)
			{
				System.out.println("Montadora:"+x.getSpecs().getModelo()+" "+"Modelo:"+x.getSpecs().getModelo()+" "+"Cambio:"+x.getSpecs().getCambio());
				System.out.println("Chassi:"+x.getChassi()+" "+"Preco:"+x.getPreco());
				System.out.println("Cor:"+x.getSpecs().getCor()+" "+"Tipo:"+x.getSpecs().getTipo()+" "+"Motorizacao:"+x.getSpecs().getMotorizacao());
				System.out.println("------------------------------------------------------------------------------");			
			}
			else if(x instanceof Motocicleta)
			{
				System.out.println("Modelo:"+x.getSpecs().getModelo()+" "+"Cor:"+x.getSpecs().getCor()+" "+"Montadora:"+x.getSpecs().getMontadora());
				System.out.println("Chassi:"+x.getChassi()+" "+"Preco:"+x.getPreco());
				System.out.println("Tipo:"+x.getSpecs().getTipo()+" "+"Cilindrada:"+x.getSpecs().getCilindrada()+" "+"Capacidade do tanque"+x.getSpecs().getCaptanque());
				System.out.println("------------------------------------------------------------------------------");	

			}
		}
	}

	
	public void buscarVeiculo() //Método para buscar um carro pelo parâmetro de seu chassi.
	{
		String aux = "";
		Scanner scan  = new Scanner(System.in);
		System.out.println("Insira chassi");
		aux = scan.next();
		for(Veiculos x: estoque)
		{
			if(x instanceof Carro)
			{
				if(x.getChassi().equals(aux))
					System.out.println("Chassi encontrado:"+x.getSpecs().getModelo()+" "+x.getSpecs().getMontadora()+" "
				+x.getSpecs().getTipo()+" "+x.getSpecs().getCambio()+" "+x.getSpecs().getMotorizacao());
				else
					System.out.println("Carro não encontrado");
			}
			else if(x instanceof Motocicleta)
			{
				x = (Motocicleta)x;
				if(x.getChassi().equals(aux))
					System.out.println("Chassi encontrado:"+x.getSpecs().getModelo()+" "+x.getSpecs().getMontadora()+" "
				+x.getSpecs().getTipo()+" "+x.getSpecs().getCilindrada()+" "+x.getSpecs().getCaptanque());
				else
					System.out.println("Moto não encontrado");
			}

		}
	}
	
		
	public void pesquisarVeiculo() // Método para buscar carros por todos os parâmetros.
	{
		ArrayList<Veiculos> search = new ArrayList<>();
		
		for(Veiculos x : search)
		{
			System.out.println("Montadora:"+x.getSpecs().getMontadora()+" "+"Modelo:"+x.getSpecs().getModelo()+" "+"Cambio:"+x.getSpecs().getCambio());
			System.out.println("Chassi:"+x.getChassi()+" "+"Preco:"+x.getPreco());
			System.out.println("Cor:"+x.getSpecs().getCor()+" "+"Tipo:"+x.getSpecs().getTipo()+" "+"Motorizacao:"+x.getSpecs().getMotorizacao());
			System.out.println("------------------------------------------------------------------------------");
		}
	}
	
	}

