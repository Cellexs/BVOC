import java.util.Scanner;

public class Message
   {
	/*
	 * There is a java API for messaging but it seems very complicated and I am not sure if it
	 * can be used without the "server" that I have seen the examples of it on.
	 */
	
	String profileName;
	
	String message;

	private Scanner receiver;
	
	private Scanner userInput;
	
	public Message()
	   {
		
	   }
	
	public void createMessage()
	   {
		receiver = new Scanner(System.in);
		System.out.println("Who would you like to send a message to? ");
		
		profileName = receiver.nextLine();
		
		/*
		 * Right here we would search through the database for the intended
		 * Profile (receiver) and link that with our Scanner message.
		 */
		
		userInput = new Scanner(System.in);
		System.out.println("Enter your message: ");
		
		message = userInput.nextLine();
		
		/*
		 * Here we would need to find a way to send our message to the intended profile.
		 */
		
	   }
   }
