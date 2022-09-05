package lockedMe.com;

import java.io.File;

public class LockedMe {
	public static final String FILES_PATH = "D:\\Kavin\\SimpliLearn-Phase1-Project\\Files";
public static void welcomeScreen()
{
	System.out.println("\n***************************************************");
	System.out.println("\tWelcome to LockedMe.com secure App");
	System.out.println("\tDeveloped by: KAVIN K R");
	System.out.println("***************************************************");
	System.out.println("\n\nENTER YOUR CHOICE:");
	System.out.println("\n1. Display all files");
}
public static void getAllFiles() 
{
	File folder = new File(FILES_PATH);
	File[] listOfFiles = folder.listFiles();
	if(listOfFiles.length>0) {
		System.out.println("The file list is displayed below:");
		for(var a:listOfFiles) {
		System.out.println(a.getName());
	}
	}
	else {
		System.out.println("\n------------------The Folder is empty!!------------------");
	}
}
}
