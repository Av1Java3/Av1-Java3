package loja;

import java.util.ArrayList;
import java.util.Scanner;

import motocicleta.CapTanque;
import motocicleta.Cilindrada;
import motocicleta.Motocicleta;
import carro.Cambio;
import carro.Carro;
import carro.Cor;
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
		Cor _cor = null;
		Modelo _modelo=null;
		Montadora _montadora = null;
		Tipo _tipo = null;
		Motorizacao _motorizacao = null; 
		String _chassi = "";
		float _preco = 0;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite numero do modelo: (1)CIVIC, (2)S2000, (3)GOL");
		_modelo = Modelo.values()[scan.nextInt()];
		System.out.println("Digite numero do cambio:AUTOMÁTICO(1), SEMI_AUTOMÁTICO(2), MANUAL(3)");
		_cambio = Cambio.values()[scan.nextInt()];
		System.out.println("Digite numero da Cor:BRANCO(1), CINZA(2), PRETO(3), VERMELHO(4), VINHO(5), AZUL(6), MARROM(7), VERDE(8), OCRE(9)");
		_cor = Cor.values()[scan.nextInt()];
		System.out.println("Digite numero da montadora: YAMAHA(1),HONDA(2),HARLEY_DAVIDSON(3),KAWASAKI(4)");
		_montadora = Montadora.values()[scan.nextInt()];
		System.out.println("Digite numero do tipo: SEDAN(1), HATCH(2), ESPORTIVO(3), CONVERSIVEL(4), COUPE(5)");
		_tipo = Tipo.values()[scan.nextInt()];
		System.out.println("Digite numero do motor: M10(1), M12(2), M14(3), M16(4), M18(5), M20(6), M22(7)");
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
		Cor _cor = null;
		Cilindrada _cilindrada = null;
		CapTanque _capTanque = null;
		Modelo _modelo = null;
		Tipo _tipo = null;
		Montadora _montadora = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o chassi");
		_chassi = scan.next();
		System.out.println("Qual o preço?");
		_preco = scan.nextFloat();
		System.out.println("Qual o numero da cor: PRETA(1),PRATA(2),AMARELA(3),VERDE(4)");
		_cor = Cor.values()[scan.nextInt()];
		System.out.println("Qual é o numero da cilindrada:C1000(1),C900(2),C850(3),C883(4),C750(5)");
		_cilindrada = Cilindrada.values()[scan.nextInt()];
		System.out.println("Qual é a capacidade do tanque:L12_5(1),L17(2),L17_8(3)");
		_capTanque = CapTanque.values()[scan.nextInt()];
		System.out.println("Qual o numero do modelo: VMAX(1),SUPER_TENERE(2),SUPER_TENERE_DX(3),CB_1000R(4),CBR_1000RR_FIREBLADE(5),SHADOW_750(6),IRON_883(7),CUSTOM_1200(8),STREET_BOB(9),VULCAN_900_CLASSIC(10),VULCAN_900_CUSTOM(11),VULCAN_900_CLASSIC_LT(12)");
		_modelo = Modelo.values()[scan.nextInt()];
		System.out.println("Qual o tipo: CRUISER(1),SPORT(2),OFFROAD(3)");
		_tipo = Tipo.values()[scan.nextInt()];
		System.out.println("Qual a montadora:YAMAHA(1),HONDA(2),HARLEY_DAVIDSON(3),KAWASAKI(4)");
		_montadora = Montadora.values()[scan.nextInt()];
		
		Motocicleta xyz = new Motocicleta(__preco, __chassi, __cor, __cilindrada, __capTanque, __modelo, __montadora, __tipo);
		estoqueMotos.add(xyz);
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
}
