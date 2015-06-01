package veiculos;

import java.util.ArrayList;
import java.util.HashMap;

import main.Sup;



//Classe abstrata pai Veículos que terá todas as variáveis herdadas por padrão.

public class Veiculos 
{
	
		private float preco;
		private String chassi;
		private HashMap<String, Enum> mapa;
		
		
		
		public Veiculos()
		{
			 mapa = new HashMap<String,Enum>();
			 
			 mapa.put("TipoVeiculo",Sup.addTipoVeiculo());
			 
			 if(mapa.containsValue(TipoVeiculo.CARRO))
			 {
				 mapa.put("Cambio", Sup.addCambio());
				 mapa.put("Motorizacao",Sup.addMotorizacao());
			 }
			 else if(mapa.containsValue(TipoVeiculo.MOTO))
			 {
				 mapa.put("Cilindrada", Sup.addCilindrada());
				 mapa.put("CapTanque",Sup.addCaptanque());
			 }	 
			 mapa.put("Cores",Sup.addCor());
			 mapa.put("Modelo",Sup.addModelo());
			 mapa.put("montadoras",Sup.addMontadora());
			 mapa.put("Tipo",Sup.addTipo());
			 
			 setPreco(Sup.addPreco());
			 setChassi(Sup.addChassi());
		}



		public float getPreco() {
			return preco;
		}



		public void setPreco(float preco) {
			this.preco = preco;
		}



		public String getChassi() {
			return chassi;
		}



		public void setChassi(String chassi) {
			this.chassi = chassi;
		}



		public HashMap<String, Enum> getMapa() {
			return mapa;
		}



		public void setMapa(HashMap<String, Enum> mapa) {
			this.mapa = mapa;
		}
		
		
		
}
