package application;

import domnio.Pessoa;

public class JpaTest {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Alex", "alex@gmail.com");
		Pessoa p2 = new Pessoa(1, "Mila", "mila@gmail.com");
		Pessoa p3 = new Pessoa(1, "Havilla", "havilla@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		

	}

}
