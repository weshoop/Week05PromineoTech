package week05project;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		StringBuilder spacedLog = new StringBuilder();
		
		for (int i = 0; i < log.length(); i++) {
			spacedLog.append(log.charAt(i));
			
			if (i < log.length() - 1) {
				spacedLog.append(" ");
			}
		}
		System.out.println(spacedLog);
	}

	@Override
	public void error(String error) {
		
		StringBuilder spacedErrorLog = new StringBuilder();
		
		for (int i = 0; i < error.length(); i++) {
			spacedErrorLog.append(error.charAt(i));
			
			if (i < error.length() - 1) {
				spacedErrorLog.append(" ");
			}
		}
		System.out.println("ERROR: " + spacedErrorLog);
	}

}
