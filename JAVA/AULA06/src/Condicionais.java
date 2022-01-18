
public class Condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 23;
		
		if(idade > 18 && idade < 70) {
			System.out.println("Voto obrigatório!");
		}
		else if(idade >= 70 || idade > 16 && idade <= 18) {
			System.out.println("Voto Facultativo!");
		}
		else {
			System.out.println("Você não pode votar!");
		}
	}
}
