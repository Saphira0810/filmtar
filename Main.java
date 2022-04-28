package Filmtar.Filmtar;

import java.util.Collections;
import java.util.Scanner;

public class Main extends Commands{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		//Videoanyagok v1= new Videoanyagok();
		beolvas();

		Collections.sort(lista,new YearComparator());  //k�s�bb haszn�lom az �v szerinti list�z�shoz :) 
		
		while (true) {
			Fomenu();
			String cmd=input.nextLine();
			if (cmd.equals("1"))
			{
				AddMenu();
				addChoice();
			}else if(cmd.equals("2")) {
				SearchMenu();
				searchChoice();
			}
			else if(cmd.equals("3")) {
				DeleteMenu();
			}else if(cmd.equals("4")) {
				searchByName();
			}else if(cmd.equals("5")) {
				Fajlbair();
				break;
			}else {
				System.err.println("Hib�s bemenet");
			}
			
			
		}
		input.close();
	}

	

}
