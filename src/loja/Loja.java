package loja;

import java.util.ArrayList;
import java.util.Scanner;

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
		System.out.println("Digite numero do cambio");
		_cambio = Cambio.values()[scan.nextInt()];
		System.out.println("Digite numero da Cor");
		_cor = Cor.values()[scan.nextInt()];
		System.out.println("Digite numero da montadora");
		_montadora = Montadora.values()[scan.nextInt()];
		System.out.println("Digite numero do tipo");
		_tipo = Tipo.values()[scan.nextInt()];
		System.out.println("Digite numero do motor");
		_motorizacao = Motorizacao.values()[scan.nextInt()];
		System.out.println("Digite o chassi");
		_chassi = scan.next();
		System.out.println("Digite o preço do carro");
		_preco = scan.nextFloat();
		
		
		Carro aux = new Carro(_chassi, _preco, _montadora, _modelo, _motorizacao, _cambio, _tipo, _cor);
		estoqueCarros.add(aux);
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
		
}
