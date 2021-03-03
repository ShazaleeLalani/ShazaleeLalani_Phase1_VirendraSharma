package company.Lockerspvtltd.com;

public class HomePage {

	final static String PATHNAME="src/resources";
	
	
	public static void main(String[] args) {
		
		System.out.println("\n****************** LockedMe.com *********************"+
							"\n***************** Shazalee Lalani ******************"+
							"\n\nDIRECTORY : "+PATHNAME);
		
		
		MainMenu mainMenu= new MainMenu(PATHNAME);
		mainMenu.showMenu();
		
	}
}
