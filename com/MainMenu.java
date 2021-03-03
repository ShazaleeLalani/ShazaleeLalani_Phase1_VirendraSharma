package company.Lockerspvtltd.com;

import java.util.Scanner;
import java.util.InputMismatchException;


public class MainMenu {

	Files files;

	private static final String PROMPT =
			"\nMAIN MENU - Select any of the following:  \n"+
			"1 :- List files in directory\n"+
			"2 :- Add, Delete or Search\n"+
			"3 :- Exit Program";
	
	public MainMenu(String pathname){
		files = new Files(pathname);
	}

	//FIRST MENU
	void showMenu(){
		System.out.println(PROMPT);
	
	try{
		Scanner scanner= new Scanner(System.in);
		int option= scanner.nextInt();
		
		switch (option){
		case 1 : {
			files.displayFilesList();
			showMenu();
		}
		case 2 : {
			new SecondMenu().showSecondMenu();
		}
		case 3 : {
			System.out.println("Thank you....!!");
			System.exit(0);
		}
		default : {
			showMenu();
		}
	}
}
	catch (Exception e){
		System.out.println("Please enter 1,2 or 3\n");
		showMenu();
		}
	}	
}


