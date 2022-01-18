
public class Principal {

	public static void main(String[] args) {
		double saldo_ini = 500;
		double valor_descontar = 100;
		
		System.out.println(Sacar(saldo_ini, valor_descontar));
	}
	
	public static double Sacar(double saldo_ini, double valor){
		double valor_descontado = saldo_ini - valor;
		return valor_descontado;
	}

}
