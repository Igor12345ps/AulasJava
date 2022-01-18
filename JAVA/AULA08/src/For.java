
public class For {

	public static void main(String[] args) {
		
		/*for(int i = 0; i <=10; i++) {
			System.out.println(i);
		}*/
		
		for(int i = 0; i <=10; i++) {
			System.out.println("Tabuada do " + i);
			for(int j = 0; j <=10; j++) {
				int result = i * j;
				System.out.println(i + " * " + j + " = " + result);
			}
			System.out.println("");
		}
		
	}

}
