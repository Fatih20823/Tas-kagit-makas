package com.main;
import java.util.Scanner;

public class Application {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static void main(String[] args) {
		//Rock(1) - Paper(2) - Scissors(3)
		String[] Choice = new String[] {"","Rock","Paper","Scissors"};
		int computerChoice;
		int playerChoice;
		int numberOfComputerWin=0;
		int numberOfPlayerWin=0;
		
		do {
			computerChoice = (int) (Math.random()*3+1);
			System.out.print("Enter Your Choice = ");
			playerChoice = integerRead(0,3);
			
			System.out.print("Computer Choice = "+Choice[computerChoice]);
			System.out.println("  Player Choice = "+Choice[playerChoice]);
			if(playerChoice !=0) {
				if(computerChoice == playerChoice) {
					System.out.println("Draw");
				}else if ((computerChoice==1 && playerChoice==3) || (computerChoice==2 && playerChoice==1) || (computerChoice==3 && playerChoice==2)){
							numberOfComputerWin++;
							System.out.print("Computer Win");
							System.out.println("Score ===> Computer = "+numberOfComputerWin+" - Player = "+numberOfPlayerWin);
				}else {
					numberOfPlayerWin++;
					System.out.print("Player Win");
					System.out.println("Score ===> Computer = "+numberOfComputerWin+" - Player = "+numberOfPlayerWin);
				}
			}
			
		} while(playerChoice !=0);
		
		if (numberOfComputerWin == numberOfPlayerWin) System.out.println("Draw");
		else if (numberOfComputerWin>numberOfPlayerWin) System.out.println("Computer Win");
		else System.out.println("Player Win");
		System.out.println("Last Score ===> Computer = "+numberOfComputerWin+" - Player = "+numberOfPlayerWin);
	// println color format
	}
	private static int integerRead(int min, int max) {
		Scanner scan = new Scanner(System.in);
		int number =0;
		boolean readingOK=false;
		do {
			try {
				number = Integer.parseInt(scan.nextLine());
				readingOK=true;
			} catch (NumberFormatException e) {
				
			}
			if(number<min || number>max || !readingOK) {
				System.out.print("InCorrect-. Please Re*-enter("+min+" - "+max+") : ");
			}
		} while(!readingOK || number<min || number>max); 
		
		return number;
	}

}
