package veiculos;



//Classe abstrata pai Ve�culos que ter� todas as vari�veis herdadas por padr�o.

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

