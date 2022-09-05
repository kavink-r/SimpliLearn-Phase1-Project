package lockedMe.com;

import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
		LockedMe.welcomeScreen();
		choice = Integer.parseInt(sc.nextLine());
		switch(choice) 
		{
		case 1:
			LockedMe.getAllFiles();
			break;
		case 2:
			LockedMe.createNewFiles();
			break;
		case 3:
			LockedMe.deleteFile();
			break;
		case 4:
			break;
		default:
			break;
		}
		
		
		}while(choice>0);

	}

}
