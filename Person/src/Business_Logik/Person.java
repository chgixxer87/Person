package Business_Logik;

public abstract class Person {
	
	protected String NName;
	protected String VName;
	protected String birthday;
	protected String gender;
	
	public Person(){
		
	
		
	}
	
	//protected geht nicht
	public String toString(){
		return "Nachname: "+this.NName+"\nVorname: "+this.VName+"\nGeburtstag: "+this.birthday+"\nGeschlecht: "+this.gender;
	}
	

}
