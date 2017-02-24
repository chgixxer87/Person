package Business_Logik;

public abstract class Person {
	
	//änderung auf github
	protected String NName;
	protected String VName;
	protected String birthday;
	protected String gender;
	
	public Person(){
		
	//änderung 2 auf github
		//$nderung3 auf github
		
	}
	
	//protected geht nicht
	public String toString(){
		return "Nachname: "+this.NName+"\nVorname: "+this.VName+"\nGeburtstag: "+this.birthday+"\nGeschlecht: "+this.gender;
	}
	

}
