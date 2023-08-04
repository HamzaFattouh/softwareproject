package sakanat;

import GUI.adminpage;
import GUI.userspage;

public class administrator extends user{
	
	
	
	//constructor
	public administrator(String...variable) {
		super(variable);
		
	}
	
	public static void addadvertisement() {
		
	}
	
	
	
	public static void main(String [] args) {
		
	}



	public void openadminpage() {
		adminpage ad=new adminpage();
		
		ad.setVisible(true);
		
	}
	

}
