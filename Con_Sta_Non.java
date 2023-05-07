package cdpsession;

public class Con_Sta_Non {
	Con_Sta_Non (){
		System.out.println("Constructor");//after static and non static it will runs
	}
	
	static {
		System.out.println("Static "); //static blocks runs first
	}
	
	{
		System.out.println("NonStatic");//2nd no.runs
	}
	
	

}
