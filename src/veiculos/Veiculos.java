package veiculos;



//Classe abstrata pai Veículos que terá todas as variáveis herdadas por padrão.

public abstract class Veiculos 
{
		protected Cores cor;
		protected Modelo modelo;
		protected Montadoras montadora;
		protected Tipos tipo;
		protected float preco;
		protected String chassi;
		
		
		
		
		
		protected Veiculos()
		{}



		public Cores getCor() 
		{
			return cor;
		}

		public void setCor(Cores cor)
		{
			this.cor = cor;
		}


		public Modelo getModelo() 
		{
			return modelo;
		}


		public void setModelo(Modelo modelo) {
			this.modelo = modelo;
		}


		public Montadoras getMontadora() {
			return montadora;
		}


		public void setMontadora(Montadoras montadora) {
			this.montadora = montadora;
		}


		public Tipos getTipo() {
			return tipo;
		}


		public void setTipo(Tipos tipo) {
			this.tipo = tipo;
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
		
		
		
}
