package veiculos;



//Classe abstrata pai Veículos que terá todas as variáveis herdadas por padrão.

public abstract class Veiculos 
{
		protected float preco;
		protected String chassi;
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

