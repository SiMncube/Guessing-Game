import java.util.Scanner;

public class GuessingGame {
	int N; // range of numbers the user wants to guess
	int randomNumber; // generated random number for the user
	boolean isGameOver; 
	int numberPicked; // user input number//
	
	public GuessingGame() {
		
	}
	public void play() {
		while(isGameOver!=true) {
			System.out.println("Select the range of numbers you want to guess. E.g 100");
			Scanner scan = new Scanner(System.in);
			N = scan.nextInt();
			randomNumber = (int)((Math.random()*N)+1);
			System.out.println("Guess a number between 1 and " + N);
			int count = 0;
			for(int i = 0; i < 10; i++) {
				numberPicked = scan.nextInt();
				count++;
				if(numberPicked==randomNumber) {
					System.out.println("You guessed the correct number in " + count + " attempts.");
					isGameOver=true;
					System.out.println("Do you want to play again? Select 'y' or 'n'");
					String answer = scan.next();
					if(answer.equals("y")) {
						isGameOver = false;
						play(); 
					}
					else {
						isGameOver = true;
						System.out.println("Thank you for playing :)");
						break;
					}
					
				}
				else if(numberPicked<randomNumber) {
					if(count==10) {
						
					}
					else {
						System.out.println("Higher number please!");
					}
					
				}
				
				else if(numberPicked>randomNumber) {
					if(count==10) {
						
					}
					else {
						System.out.println("Lower number please!");
					}
					
				}
				if(count==10) {
					System.out.println("You failed to guess the correct number.");
					isGameOver = true;
					System.out.println("The correct number is " + randomNumber + ".");
					System.out.println("Do you want to play again? Select 'y' or 'n'");
					String answer = scan.next();
					if(answer.equals("y")) {
						isGameOver = false;
						break;
					}
					else {
						isGameOver = true;
						System.out.println("Thank you for playing :)");
						break;
					}
					
				}
			}
		}
	}
	
	
}
