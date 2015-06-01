package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import veiculos.Cambio;
import veiculos.CapTanque;
import veiculos.Cilindrada;
import veiculos.Cores;
import veiculos.Modelo;
import veiculos.Montadoras;
import veiculos.Motorizacao;
import veiculos.TipoVeiculo;
import veiculos.Tipos;
import veiculos.Veiculos;

public class Sup 
{
	static boolean loop = false;
	static Scanner scan = new Scanner(System.in);
	
	
	
	public static void printVeiculo(Veiculos x)
	{
		System.out.println(x.getMapa().toString());
	}	
	public static Veiculos addVeiculo()
	{
		Veiculos aux = new Veiculos();
		
		return aux;
	}	
	public static TipoVeiculo addTipoVeiculo()
	{
		TipoVeiculo aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente ao modelo: (0)CARRO, (1)MOTOCICLETA");
				aux = TipoVeiculo.values()[Integer.parseInt(scan.nextLine())];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(NumberFormatException nfe){
				System.out.println("Erro again dude, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static Modelo addModelo()
	{
		Modelo aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente ao modelo: (0)CIVIC, (1)S2000, (2)GOL");
				aux = Modelo.values()[Integer.parseInt(scan.nextLine())];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(NumberFormatException nfe){
				System.out.println("Erro again dude, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static Cores addCor()
	{
		Cores aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente à cor: Azul(0), Verde(1), Vermelho(2), PRETO(3), BRANCO(4), PRATA(5)");
				aux = Cores.values()[Integer.parseInt(scan.nextLine())];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(NumberFormatException nfe){
				System.out.println("Erro again dude, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static Cambio addCambio()
	{
		Cambio aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente ao cambio:AUTOMÁTICO(0), SEMI_AUTOMÁTICO(1), MANUAL(2)");
				aux = Cambio.values()[Integer.parseInt(scan.nextLine())];
				loop = true;}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");}
			catch(NumberFormatException nfe){
				System.out.println("Erro again dude, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static Montadoras addMontadora()
	{
		Montadoras aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente à montadora: WOLKSWAG(0), FIAT(1), CHEVROLET(2), HONDA(3)");
				aux = Montadoras.values()[Integer.parseInt(scan.nextLine())];
				loop = true;}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");}
			catch(NumberFormatException nfe){
				System.out.println("Erro again dude, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static Tipos addTipo()
	{
		Tipos aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero do tipo: SEDAN(0), HATCH(1), ESPORTIVO(2)");
				aux = Tipos.values()[Integer.parseInt(scan.nextLine())];
				loop = true;}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");}
			catch(NumberFormatException nfe){
				System.out.println("Erro again dude, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static Motorizacao addMotorizacao()
	{
		Motorizacao aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero do motor: M10(0), M12(1), M14(2), M16(3), M18(4), M20(5), M22(6)");
				aux = Motorizacao.values()[Integer.parseInt(scan.nextLine())];
				loop = true;}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");}
			catch(NumberFormatException nfe){
				System.out.println("Erro again dude, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static float addPreco()
	{
		float aux=0;
		while(!loop)
		{
			try{
				System.out.println("Digite o preço do carro");
				aux = scan.nextFloat();
				loop = true;}
			catch(InputMismatchException ime){
				System.out.println("Erro, favor digitar um dos numeros especificados");}
			catch(NumberFormatException nfe){
				System.out.println("Erro again dude, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static Cilindrada addCilindrada()
	{
		Cilindrada aux = null;
		while(!loop)
		{
			try
			{
				System.out.println("Qual é o numero da cilindrada:C1000(0),C900(1),C850(2),C883(3),C750(4)");
				aux = Cilindrada.values()[Integer.parseInt(scan.nextLine())];
				loop = true;
			}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");}
			catch(NumberFormatException nfe){
				System.out.println("Erro again dude, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static CapTanque addCaptanque()
	{
		CapTanque aux = null;
		while(!loop)
		{
			try
			{
				System.out.println("Qual é a capacidade do tanque:L12.5(0),L17(1),L17.8(2)");
				aux = CapTanque.values()[Integer.parseInt(scan.nextLine())];
				loop = true;
			}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");}
			catch(NumberFormatException nfe){
				System.out.println("Erro again dude, digite algo valido");}
		}loop = false;
		return aux;
	}
	public static String addChassi()
	{
		String aux = null;
		System.out.println("Digite o chassi");
		aux = scan.next();
		return aux;
	}
	/* METODO PARA GERAÇÃO AUTOMATICA DE CARROS(?)public static ArrayList<Carro> genCarro() FUCKING DREAM
	{
		SpecsCarro spec1 = new SpecsCarro();
		Carro aux1 = new Carro("ASDS234",98.00f,Specs1);
		Carro aux2 = new Carro("ASDS264",99.00f,Specs2);
		Carro aux3 = new Carro("ASDS274",100.00f,Specs3);
		ArrayList<Carro> gerados = new ArrayList<>();
		gerados.add(aux1);
		gerados.add(aux2);
		gerados.add(aux3);
		
	}*/
}

