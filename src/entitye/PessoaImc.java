package entitye;

public class PessoaImc {

		public double peso;
		public double altura;
		
		
		public PessoaImc() {
		}
		public PessoaImc(double peso, double altura) {
			this.peso = peso;
			this.altura = altura;
		}
		
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public double calcImc() {
			return  peso / (altura * altura);
		}
		
		@Override
		public String toString() {
			return "Seu IMC.............: " + String.format("%.2f%n" , calcImc() );
		}
}

