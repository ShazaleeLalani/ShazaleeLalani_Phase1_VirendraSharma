package company.Lockerspvtltd.com;

public class HomePage {

	final static String PATHNAME="C:\\Users\\danul\\Desktop\\HTML\\Core Java\\src\\company\\Lockerspvtltd\\";
	
	
	public static void main(String[] args) {
		
		System.out.println("\n****************** LockedMe.com *********************"+
							"\n***************** Shazalee Lalani ******************"+
							"\n\nDIRECTORY : "+PATHNAME);
		
		
		MainMenu mainMenu= new MainMenu(PATHNAME);
		mainMenu.showMenu();
		
	}
}
