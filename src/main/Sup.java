package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import motocicleta.CapTanque;
import motocicleta.Cilindrada;
import carro.Cambio;
import carro.Motorizacao;
import veiculos.Cores;
import veiculos.Modelo;
import veiculos.Montadoras;
import veiculos.Tipos;

public class Sup 
{
	static boolean loop = false;
	static Scanner scan = new Scanner(System.in);
	
	
	public static Modelo addModelo()
	{
		Modelo aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente ao modelo: (0)CIVIC, (1)S2000, (2)GOL");
				aux = Modelo.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
		}loop = false;
		return aux;
	}
	
	public static Cores addCor()
	{
		Cores aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente � cor: Azul(0), Verde(1), Vermelho(2), PRETO(3), BRANCO(4), PRATA(5)");
				aux = Cores.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
		}loop = false;
		return aux;
	}
	
	public static Cambio addCambio()
	{
		Cambio aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente ao cambio:AUTOM�TICO(0), SEMI_AUTOM�TICO(1), MANUAL(2)");
				aux = Cambio.values()[scan.nextInt()];
				loop = true;}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");
			}
		}loop = false;
		return aux;
	}
	public static Montadoras addMontadora()
	{
		Montadoras aux = null;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente � montadora: WOLKSWAG(0), FIAT(1), CHEVROLET(2), HONDA(3)");
				aux = Montadoras.values()[scan.nextInt()];
				loop = true;}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");
			}
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
				aux = Tipos.values()[scan.nextInt()];
				loop = true;}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");
			}
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
				aux = Motorizacao.values()[scan.nextInt()];
				loop = true;}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar um dos numeros especificados");
			}
		}loop = false;
		return aux;
	}
	public static float addPreco()
	{
		float aux=0;
		while(!loop)
		{
			try{
				System.out.println("Digite o pre�o do carro");
				aux = scan.nextFloat();
				loop = true;}
			catch(InputMismatchException ime){
				System.out.println("Erro, favor digitar um dos numeros especificados");
			}
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
				System.out.println("Qual � o numero da cilindrada:C1000(0),C900(1),C850(2),C883(3),C750(4)");
				aux = Cilindrada.values()[scan.nextInt()];
			}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.println("Erro, favor digitar um dos numeros especificados");
			}
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
				System.out.println("Qual � a capacidade do tanque:L12.5(0),L17(1),L17.8(2)");
				aux = CapTanque.values()[scan.nextInt()];
			}
			catch(InputMismatchException ime){
				System.out.println("Erro, voce digitou algo diferente de um numero");}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.println("Erro, favor digitar um dos numeros especificados");
			}
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
}
