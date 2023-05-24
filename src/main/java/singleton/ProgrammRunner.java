public class ProgrammRunner{

	public static void main (String[] args){
		
		ProgrammLogger.getProgrammLogger().addLogInfo("First log...");
		ProgrammLogger.getProgrammLogger().addLogInfo("Second log...");
		ProgrammLogger.getProgrammLogger().addLogInfo("Third log...");
		
		ProgrammLogger.getProgrammLogger().showLogFile();

		System.out.println(ProgrammLogger.getProgrammLogger().toString());
		System.out.println(ProgrammLogger.getProgrammLogger().toString());
		System.out.println(ProgrammLogger.getProgrammLogger().toString());
	
	}
}
