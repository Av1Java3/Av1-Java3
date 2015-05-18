package main;

import java.util.ArrayList;
import java.util.Scanner;

import motocicleta.Motocicleta;
import motocicleta.SpecsMoto;
import carro.Carro;
import carro.SpecsCarro;

public class Loja
{

	//Temos valores padr�es para esta vari�veis.
	String nome = "Doomhammer Motors";
	String endereco = "Rua dos bobos n 0";
	
	//Criando uma ArrayList para os estoques de carros e de motos
	ArrayList<Carro> estoqueCarros = new ArrayList<>();
	ArrayList<Motocicleta> estoqueMotos = new ArrayList<>();
	
	
	public void adicionarCarro()
	{
		//Carro aux adiciona um carro ao estoque.
		SpecsCarro spec = new SpecsCarro();
		Carro aux = new Carro(Sup.addChassi(), Sup.addPreco(),spec);
		estoqueCarros.add(aux);
	}
	public void adicionarMoto()
	{		
		//M�todo para adicionar motos.		
		SpecsMoto spec = new SpecsMoto();
		Motocicleta aux = new Motocicleta(Sup.addChassi(), Sup.addPreco(),spec);
		estoqueMotos.add(aux);
	}
	
	public void listarEstoquedeCarros() //M�todos para exibir o estoque de carros
	{
		for (Carro x: estoqueCarros)
		{
			System.out.println("Montadora:"+x.getSpecs().getModelo()+" "+"Modelo:"+x.getSpecs().getModelo()+" "+"Cambio:"+x.getCambio());
			System.out.println("Chassi:"+x.getChassi()+" "+"Preco:"+x.getPreco());
			System.out.println("Cor:"+x.getSpecs().getCor()+" "+"Tipo:"+x.getSpecs().getTipo()+" "+"Motorizacao:"+x.getMotorizacao());
			System.out.println("------------------------------------------------------------------------------");
			
		}
		
	}
		
	public void listarEstoquedeMotos() //M�todo para exibir o estoque de motos
	{
		for (Motocicleta y: estoqueMotos)
		{
			System.out.println("Modelo:"+y.getSpecs().getModelo()+" "+"Cor:"+y.getSpecs().getCor()+" "+"Montadora:"+y.getSpecs().getMontadora());
			System.out.println("Chassi:"+y.getChassi()+" "+"Preco:"+y.getPreco());
			System.out.println("Tipo:"+y.getSpecs().getTipo()+" "+"Cilindrada:"+y.getCilindrada()+" "+"Capacidade do tanque"+y.getCapTanque());
			System.out.println("-----------------------------------------------------------------------------------");
		}
	}
	public void buscarCarro() //M�todo para buscar um carro pelo par�metro de seu chassi.
	{
		String aux = "";
		Scanner scan  = new Scanner(System.in);
		System.out.println("Insira chassi");
		aux = scan.next();
		for(Carro x: estoqueCarros)
		{
			if(x.getChassi().equals(aux))
				System.out.println("Chassi encontrado:"+x.getSpecs().getModelo()+" "+x.getSpecs().getMontadora()+" "+x.getSpecs().getTipo());
			else
				System.out.println("Carro n�o encontrado");
		}
	}
	
	public void buscarMotocicleta() //M�todo para buscar uma moto pelo par�metro de seu chassi.
	{
		String aux = "";
		Scanner scan  = new Scanner(System.in);
		System.out.println("Insira chassi");
		aux = scan.next();
		for(Motocicleta x: estoqueMotos)
		{
			if(x.getChassi().equals(aux))
				System.out.println("Chassi encontrado:"+x.getSpecs().getModelo()+" "+x.getSpecs().getMontadora()+" "+x.getSpecs().getTipo());

			else
				System.out.println("Chassi n�o encontrado");
		}
	}
	
	public void pesquisarCarro() // M�todo para buscar carros por todos os par�metros.
	{
		Scanner scan  = new Scanner(System.in);
		ArrayList<Carro> search = new ArrayList<Carro>();
		
		for(Carro x : estoqueCarros)
		{
			search.add(x);
		}
		
		System.out.println("Digite uma Cor. Digite 0 para pular este parametro");
		String auxCor = scan.next().toUpperCase();
		if(!(auxCor.equals("0")))
		{
			for(Carro x : search)
			{
				if(x.getSpecs().getCor().toString()!=auxCor)
					search.remove(x);
			}
		}
		
		System.out.println("Digite uma Tipo. Digite 0 para pular este parametro");
		String auxTipo = scan.next().toUpperCase();
		if(!(auxTipo.equals("0")))
		{
			for(Carro x : search)
			{
				if(x.getSpecs().getTipo().toString()!=auxTipo)
					search.remove(x);
			}
		}
		
		System.out.println("Digite uma Montadora. Digite 0 para pular este parametro");
		String auxMontadora = scan.next().toUpperCase();
		if(!(auxMontadora.equals("0")))
		{
			for(Carro x : search)
			{
				if(x.getSpecs().getMontadora().toString()!=auxMontadora)
					search.remove(x);
			}
		}
		
		System.out.println("Digite uma Modelo. Digite 0 para pular este parametro");
		String auxModelo = scan.next().toUpperCase();
		if(!(auxModelo.equals("0")))
		{
			for(Carro x : search)
			{
				if(x.getSpecs().getModelo().toString()!=auxModelo)
					search.remove(x);
			}
		}
		
		System.out.println("Digite uma Cambio. Digite 0 para pular este parametro");
		String auxCambio = scan.next().toUpperCase();
		if(!(auxCambio.equals("0")))
		{
			for(Carro x : search)
			{
				if(x.getCambio().toString()!=auxCambio)
					search.remove(x);
			}
		}
		
		System.out.println("Digite uma Motorizacao, ex: M10. Digite 0 para pular este parametro");
		String auxMotorizacao = scan.next().toUpperCase();
		if(!(auxMotorizacao.equals("0")))
		{
			for(Carro x : search)
			{
				if(x.getMotorizacao().toString()!=auxMotorizacao)
					search.remove(x);
			}
		}
		
		for(Carro x : search)
		{
			System.out.println("Montadora:"+x.getSpecs().getMontadora()+" "+"Modelo:"+x.getSpecs().getModelo()+" "+"Cambio:"+x.getCambio());
			System.out.println("Chassi:"+x.getChassi()+" "+"Preco:"+x.getPreco());
			System.out.println("Cor:"+x.getSpecs().getCor()+" "+"Tipo:"+x.getSpecs().getTipo()+" "+"Motorizacao:"+x.getMotorizacao());
			System.out.println("------------------------------------------------------------------------------");
		}
	}
	
	public void pesquisarMotos() //M�todo para pesquisar motos por todos os seus par�metros.
	{
		Scanner scan  = new Scanner(System.in);
		System.out.println("Digite uma Cor");
		String auxMCor = scan.next();
		System.out.println("Digite um Tipo");
		String auxMTipo = scan.next();
		System.out.println("Digite uma Montadora");
		String auxMmontadora = scan.next();
		
		for(Motocicleta y : estoqueMotos)
		{
			if(y.getSpecs().getCor().toString().equals(auxMCor))
				if(y.getSpecs().getTipo().toString().equals(auxMTipo))
					if(y.getSpecs().getMontadora().toString().equals(auxMmontadora))
					{
						System.out.println("Modelo:"+y.getSpecs().getModelo()+" "+"Cor:"+y.getSpecs().getCor()+" "+"Montadora:"+y.getSpecs().getMontadora());
						System.out.println("Tipo:"+y.getSpecs().getTipo()+" "+"Cilindrada:"+y.getCilindrada()+" "+"Capacidade do tanque"+y.getCapTanque());
						System.out.println("-----------------------------------------------------------------------------------");
					}
		}
	}
	
}