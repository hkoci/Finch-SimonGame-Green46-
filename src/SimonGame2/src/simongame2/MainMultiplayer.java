package simongame2;

import java.util.Scanner;

public class MainMultiplayer {
	
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Would you like to 1) host or 2) join a game?");
		Scanner choiceInput = new Scanner(System.in);
		int choice = choiceInput.nextInt();
		
		if (choice == 1)
		{
			System.out.println("host");
			GameMulitplayerServer server = new GameMulitplayerServer();
			GameMulitplayerServer.main(args);
		}
		else if (choice == 2)
		{
			System.out.println("join");
			GameMultiplayerClient client = new GameMultiplayerClient();
			GameMultiplayerClient.main(args);
		}
		
		else
		{
			System.out.println("Enter an option please.");
			main(args);
		}
	}
}
