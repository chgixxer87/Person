package Business_Logik;

import java.util.Scanner;

public class Student extends Person {
	
	String schule;
	String studiengang;
	int ID;
	
	public Student(){
			
	}
	
	//hier muss auch ein Scanner noch importiert werden
	public static void inscribe(Scanner read){
		//da static mehtode kann auf die instanzvariablen nicht
		//zugegriffen werden (es wurde ja noch kein Student obj erzeugt)
		//-->lösung: temporäres stundenten-obj erstellen
		Student s= new Student();
		s.schule
		
		
		
	}
	
	public int generateID(){
		return 0;
	}
	
	public String toString(){
		return super.toString()+"\nSchule: "+this.schule+"\nStudiengang: "+this.studiengang+"\nSchüler-ID: "+this.ID;
		
	}
	

}
