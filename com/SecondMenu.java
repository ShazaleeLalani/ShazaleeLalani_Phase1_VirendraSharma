package company.Lockerspvtltd.com;

import java.util.Scanner;

public class SecondMenu {

Files files;
	
	private static final String SECOND_PROMPT =
			"   \nSelect any of the following:  \n"+
			"    a:- Add a file\n"+
			"    b:- Delete a file\n"+
			"    c:- Search a file\n"+
			"    d:- GoBack";
	
	public SecondMenu(){
		this.files= new Files(HomePage.PATHNAME);
	}
	
	void showSecondMenu(){
		System.out.println(SECOND_PROMPT);
		try{
			Scanner scanner = new Scanner(System.in);
			char[] input = scanner.nextLine().toLowerCase().trim().toCharArray();
			char option = input[0];
			
			switch (option){
			case 'a' : {
				System.out.println("   Adding a file....");
				files.addFile(files.takeFilenameInput());
				showSecondMenu();
			}
			case 'b' : {
				System.out.println("   Delete a file....");
				files.deleteFile(files.takeFilenameInput());
				showSecondMenu();
			}
			case 'c' : {
				System.out.println("    Search a file....");
				files.searchFile(files.takeFilenameInput());
				showSecondMenu();
			}
			case 'd' : {
				System.out.println("    Go back to the MAIN menu....");
				new MainMenu(HomePage.PATHNAME).showMenu();
			}
			default : {
				System.out.println("    Please enter a, b, c or d..");
				showSecondMenu();
			}
		}
	}
		catch (Exception e){
			System.out.println("    Please enter a,b,c or d..");
			showSecondMenu();
		}
	}

}

