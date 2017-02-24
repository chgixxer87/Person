package Business_Logik;

import java.util.Scanner;

public class test_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student joel= new Student();
		
		//äquivalent zu joel.toString();
		System.out.println(joel);
		
		Scanner read= new Scanner(System.in);
		Student.inscribe(read);

	}

}
