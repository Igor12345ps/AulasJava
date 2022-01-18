
public class Logicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean n1 = 1 > 2 && 3 != 4; // false && true == false
		boolean n2 = !(1 > 2) && 3 != 4; // true && true == true
		boolean n3 = 9 < 4; // false
		System.out.println("-------------------------");
		boolean n4 = n1 || n2 && n3;  //false || false  == false
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}

}
