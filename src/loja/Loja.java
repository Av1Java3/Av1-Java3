package loja;

import java.util.ArrayList;
import java.util.Scanner;

import motocicleta.MCapTanque;
import motocicleta.MCilindrada;
import motocicleta.MModelo;
import motocicleta.MMontadora;
import motocicleta.MTipo;
import motocicleta.Motocicleta;
import veiculos.Cores;
import carro.Cambio;
import carro.Carro;
import carro.Modelo;
import carro.Montadora;
import carro.Motorizacao;
import carro.Tipo;

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
		Montadora _montadora = null;
		Tipo _tipo = null;
		Motorizacao _motorizacao = null; 
		String _chassi = "";
		float _preco = 0;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite numero do modelo: (0)CIVIC, (1)S2000, (2)GOL");
		_modelo = Modelo.values()[scan.nextInt()];
		System.out.println("Digite numero do cambio:AUTOMÁTICO(0), SEMI_AUTOMÁTICO(1), MANUAL(2)");
		_cambio = Cambio.values()[scan.nextInt()];
		System.out.println("Digite numero da Cor:BRANCO(0), CINZA(1), PRETO(2), VERMELHO(3), VINHO(4), AZUL(5), MARROM(6), VERDE(7), OCRE(8)");
		_cor = Cores.values()[scan.nextInt()];
		System.out.println("Digite numero da montadora: YAMAHA(0),HONDA(1),HARLEY_DAVIDSON(2),KAWASAKI(3)");
		_montadora = Montadora.values()[scan.nextInt()];
		System.out.println("Digite numero do tipo: SEDAN(0), HATCH(1), ESPORTIVO(2), CONVERSIVEL(3), COUPE(4)");
		_tipo = Tipo.values()[scan.nextInt()];
		System.out.println("Digite numero do motor: M10(0), M12(1), M14(2), M16(3), M18(4), M20(5), M22(6)");
		_motorizacao = Motorizacao.values()[scan.nextInt()];
		System.out.println("Digite o chassi");
		_chassi = scan.next();
		System.out.println("Digite o preço do carro");
		_preco = scan.nextFloat();
		
		
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
		motocicleta.MModelo _modelo = null;
		motocicleta.MTipo _tipo = null;
		motocicleta.MMontadora _montadora = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o chassi?");
		_chassi = scan.next();
		System.out.println("Qual o preço?");
		_preco = scan.nextFloat();
		System.out.println("Qual o numero da cor: PRETA(0),PRATA(1),AMARELA(2),VERDE(3)");
		_cor = Cores.values()[scan.nextInt()];
		System.out.println("Qual é o numero da cilindrada:C1000(0),C900(1),C850(2),C883(3),C750(4)");
		_cilindrada = MCilindrada.values()[scan.nextInt()];
		System.out.println("Qual é a capacidade do tanque:L12_5(0),L17(1),L17_8(2)");
		_capTanque = MCapTanque.values()[scan.nextInt()];
		System.out.println("Qual o numero do modelo: VMAX(0),SUPER_TENERE(1),SUPER_TENERE_DX(2),CB_1000R(3),CBR_1000RR_FIREBLADE(4),SHADOW_750(5),IRON_883(6),CUSTOM_1200(7),STREET_BOB(8),VULCAN_900_CLASSIC(9),VULCAN_900_CUSTOM(10),VULCAN_900_CLASSIC_LT(11)");
		_modelo = MModelo.values()[scan.nextInt()];
		System.out.println("Qual o tipo: CRUISER(0),SPORT(1),OFFROAD(2)");
		_tipo = MTipo.values()[scan.nextInt()];
		System.out.println("Qual a montadora:YAMAHA(0),HONDA(1),HARLEY_DAVIDSON(2),KAWASAKI(3)");
		_montadora = MMontadora.values()[scan.nextInt()];
		
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
			System.out.println("Modelo:"+y.getModelo()+" "+"Cor:"+y.getCor()+" "+"Montadora:"+y.getMontadora());
			System.out.println("Tipo:"+y.getTipo()+" "+"Cilindrada:"+y.getCilindrada()+" "+"Capacidade do tanque"+y.getCapTanque());
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
				System.out.println("No Bacon for You motherfucker");
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
				System.out.println("Chassi encontrado:"+x.getModelo()+" "+x.getMontadora()+" "+x.getTipo());

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
				if(y.getTipo().toString().equals(auxMTipo))
					if(y.getMontadora().toString().equals(auxMmontadora))
					{
						System.out.println("Modelo:"+y.getModelo()+" "+"Cor:"+y.getCor()+" "+"Montadora:"+y.getMontadora());
						System.out.println("Tipo:"+y.getTipo()+" "+"Cilindrada:"+y.getCilindrada()+" "+"Capacidade do tanque"+y.getCapTanque());
						System.out.println("-----------------------------------------------------------------------------------");
					}
		}
	}
	
}
