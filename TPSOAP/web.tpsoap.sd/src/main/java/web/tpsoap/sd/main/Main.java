package web.tpsoap.sd.main;

import java.util.Scanner;

import web.tpsoap.sd.main.MenuReservation;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MenuReservation menu = new MenuReservation();
		String choiceMenu;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			menu.reservation();
			Thread.sleep(2000);
			
			System.out.println("Voulez vous continuer ou arreter l'application ?");
			System.out.println("0 : Exit");
			System.out.println("1 : Continuer");
			
			do{
				choiceMenu = scan.nextLine();
			}while(!(choiceMenu.equals("0") || choiceMenu.equals("1")));
			
		}
		while(choiceMenu.equals("1"));
		System.out.println("Bye !");
		
		scan.close();
	}
}
