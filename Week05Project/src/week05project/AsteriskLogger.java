package week05project;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");	
	}

	@Override
	public void error(String error) {
		String message = "***Error: " + error + "***";
		int boxLength = message.length();
		
		for (int i = 0; i < boxLength; i ++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println(message);
		
		for (int i = 0; i < boxLength; i++) {
			System.out.print("*");
		}
	}

	
}
