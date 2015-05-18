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
		
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Veiculos))
				return false;
			Veiculos other = (Veiculos) obj;
			if (chassi == null) {
				if (other.chassi != null)
					return false;
			} else if (!chassi.equals(other.chassi))
				return false;
			if (Float.floatToIntBits(preco) != Float
					.floatToIntBits(other.preco))
				return false;
			return true;
		}
		
		
		
}

