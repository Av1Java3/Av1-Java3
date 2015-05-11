package loja;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import motocicleta.MCapTanque;
import motocicleta.MCilindrada;
import motocicleta.Motocicleta;
import veiculos.Cores;
import veiculos.Montadoras;
import veiculos.Modelo;
import veiculos.Tipos;
import carro.Cambio;
import carro.Carro;
import carro.Motorizacao;

public class Loja
{

	String nome = "Doomhammer Motors";
	String endereco = "Rua dos bobos n 0";
	
	ArrayList<Carro> estoqueCarros = new ArrayList<>();
	ArrayList<Motocicleta> estoqueMotos = new ArrayList<>();
	
	
	public void adicionarCarro()
	{
		Cambio _cambio = null;
		Cores _cor = null;
		Modelo _modelo=null;
		Montadoras _montadora = null;
		Tipos _tipo = null;
		Motorizacao _motorizacao = null; 
		String _chassi = "";
		float _preco = 0;
		boolean loop = false;
		
		Scanner scan = new Scanner(System.in);
		
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente ao modelo: (0)CIVIC, (1)S2000, (2)GOL");
				_modelo = Modelo.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente ao cambio:AUTOMÁTICO(0), SEMI_AUTOMÁTICO(1), MANUAL(2)");
				_cambio = Cambio.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente à cor: PRETO(3), BRANCO(4), PRATA(5)");
				_cor = Cores.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente à montadora: WOLKSWAG(0), FIAT(1), CHEVROLET(2), HONDA(3)");
				_montadora = Montadoras.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try{
				System.out.println("Digite numero do tipo: SEDAN(0), HATCH(1), ESPORTIVO(2)");
				_tipo = Tipos.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try{
				System.out.println("Digite numero do motor: M10(0), M12(1), M14(2), M16(3), M18(4), M20(5), M22(6)");
				_motorizacao = Motorizacao.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		System.out.println("Digite o chassi");
		_chassi = scan.next();
		
		while(!loop)
		{
			try{
				System.out.println("Digite o preço do carro");
				_preco = scan.nextFloat();
				loop = true;}
			catch(InputMismatchException ime){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		
		Carro aux = new Carro(_chassi, _preco, _montadora, _modelo, _motorizacao, _cambio, _tipo, _cor);
		estoqueCarros.add(aux);
	}
	public void adicionarMoto()
	{
		String _chassi = "";
		float _preco= 0;
		Cores _cor = null;
		MCilindrada _cilindrada = null;
		MCapTanque _capTanque = null;
		Modelo _modelo = null;
		Tipos _tipo = null;
		Montadoras _montadora = null;
		boolean loop = false;
		Scanner scan = new Scanner(System.in);
		
		while(!loop)
		{
			try
			{
				System.out.println("Qual é o chassi?");
				_chassi = scan.next();
				loop = true;
			}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
			System.out.println("Erro, favor digitar un dos numeros especificados");
			}
			
		}loop = false;
		
		while(!loop)
		{
			try
			{
				System.out.println("Qual o preço?");
				_preco = scan.nextFloat();
				loop = true;
			}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try
			{
			System.out.println("Qual o numero da cor: Azul(0), Verde(1), Vermelho(2)");
			_cor = Cores.values()[scan.nextInt()];
			}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try
			{
				System.out.println("Qual é o numero da cilindrada:C1000(0),C900(1),C850(2),C883(3),C750(4)");
				_cilindrada = MCilindrada.values()[scan.nextInt()];
			}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try
			{
				System.out.println("Qual é a capacidade do tanque:L12.5(0),L17(1),L17.8(2)");
				_capTanque = MCapTanque.values()[scan.nextInt()];
			}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try
			{
				System.out.println("Qual o numero do modelo: VMAX(3),SUPER_TENERE(4), SHADOW_750(5)");
				_modelo = Modelo.values()[scan.nextInt()];
			}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;

		while(!loop)
		{
			try
			{
				System.out.println("Qual o tipo: CRUISER(3),SPORT(4),OFFROAD(5)");
				_tipo = Tipos.values()[scan.nextInt()];
			}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try
			{	
				System.out.println("Qual a montadora:HONDA(4),HARLEY_DAVIDSON(5),YAMAHA(6)");
				_montadora = Montadoras.values()[scan.nextInt()];
			}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try
			{
				System.out.println("Digite o preço da motocicleta");
				_preco = scan.nextFloat();
				loop = true;
			}
			catch(InputMismatchException ime)
			{
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		
		Motocicleta zxy = new Motocicleta(_chassi, _preco, _cor, _cilindrada, _capTanque, _modelo, _montadora, _tipo);
	}
	
	public void listarEstoquedeCarros()
	{
		for (Carro x: estoqueCarros)
		{
			System.out.println("Montadora:"+x.getMontadora()+" "+"Modelo:"+x.getModelo()+" "+"Cambio:"+x.getCambio());
			System.out.println("Chassi:"+x.getChassi()+" "+"Preco:"+x.getPreco());
			System.out.println("Cor:"+x.getCor()+" "+"Tipo:"+x.getTipo()+" "+"Motorizacao:"+x.getMotorizacao());
			System.out.println("------------------------------------------------------------------------------");
			
		}
		
	}
		
	public void listarEstoquedeMotos()
	{
		for (Motocicleta y: estoqueMotos)
		{
			System.out.println("Modelo:"+y.getmodelo()+" "+"Cor:"+y.getCor()+" "+"Montadora:"+y.getmontadora());
			System.out.println("Tipo:"+y.gettipo()+" "+"Cilindrada:"+y.getCilindrada()+" "+"Capacidade do tanque"+y.getCapTanque());
			System.out.println("-----------------------------------------------------------------------------------");
		}
	}
	public void buscarCarro()
	{
		String aux = "";
		Scanner scan  = new Scanner(System.in);
		System.out.println("Insira chassi");
		aux = scan.next();
		for(Carro x: estoqueCarros)
		{
			if(x.getChassi().equals(aux))
				System.out.println("Chassi encontrado:"+x.getModelo()+" "+x.getMontadora()+" "+x.getTipo());
			else
				System.out.println("Carro não encontrado");
		}
	}
	
	public void buscarMotocicleta()
	{
		String aux = "";
		Scanner scan  = new Scanner(System.in);
		System.out.println("Insira chassi");
		aux = scan.next();
		for(Motocicleta x: estoqueMotos)
		{
			if(x.getChassi().equals(aux))
				System.out.println("Chassi encontrado:"+x.getmodelo()+" "+x.getmontadora()+" "+x.gettipo());

			else
				System.out.println("Chassi não encontrado");
		}
	}
	
	public void pesquisarCarro()
	{
		Scanner scan  = new Scanner(System.in);
		System.out.println("Digite uma Cor");
		String auxCor = scan.next();
		System.out.println("Digite um Tipo");
		String auxTipo = scan.next();
		System.out.println("Digite uma Montadora");
		String auxMontadora = scan.next();
		
		for(Carro x : estoqueCarros)
		{
			if(x.getCor().toString().equals(auxCor))
				if(x.getTipo().toString().equals(auxTipo))
					if(x.getMontadora().toString().equals(auxMontadora))
					{
						System.out.println("Montadora:"+x.getMontadora()+" "+"Modelo:"+x.getModelo()+" "+"Cambio:"+x.getCambio());
						System.out.println("Chassi:"+x.getChassi()+" "+"Preco:"+x.getPreco());
						System.out.println("Cor:"+x.getCor()+" "+"Tipo:"+x.getTipo()+" "+"Motorizacao:"+x.getMotorizacao());
						System.out.println("------------------------------------------------------------------------------");
					}
		}
	}
	
	public void pesquisarMotos()
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
			if(y.getCor().toString().equals(auxMCor))
				if(y.gettipo().toString().equals(auxMTipo))
					if(y.getmontadora().toString().equals(auxMmontadora))
					{
						System.out.println("Modelo:"+y.getmodelo()+" "+"Cor:"+y.getCor()+" "+"Montadora:"+y.getmontadora());
						System.out.println("Tipo:"+y.gettipo()+" "+"Cilindrada:"+y.getCilindrada()+" "+"Capacidade do tanque"+y.getCapTanque());
						System.out.println("-----------------------------------------------------------------------------------");
					}
		}
	}
	
}
