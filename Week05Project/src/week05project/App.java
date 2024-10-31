package week05project;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Asterisk Log:");
		Logger logger1 = new AsteriskLogger();
		
		logger1.log("Test");
		
		System.out.println("Asterisk Error: ");
		
		Logger logger2 = new AsteriskLogger();
		
		logger2.error("Hello");
		
		System.out.println();
		System.out.println("Spaced Log: ");
		
		Logger logger3 = new SpacedLogger();
		logger3.log("Candy");
		
		System.out.println("Spaced Error: ");
		
		Logger logger4 = new SpacedLogger();
		logger4.error("Popcorn");
		
	}

}
