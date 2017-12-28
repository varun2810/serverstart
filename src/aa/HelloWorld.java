package aa;

import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;

public class HelloWorld {
	
	public void startServer() {
		CommandLine cmd = new CommandLine("/usr/local/bin/node");
		cmd.addArgument("/usr/local/bin/appium");
		cmd.addArgument("--address");
		cmd.addArgument("127.0.0.1");
		cmd.addArgument("--port");
		cmd.addArgument("4723");
		
		DefaultExecuteResultHandler handler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		try {
		
			executor.execute(cmd, handler);
			Thread.sleep(10000);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void stopServer() {
		String[] command = { "/usr/bin/killall", "-KILL", "node" };
		try {
			Runtime.getRuntime().exec(command);
			System.out.println("Appium server stopped.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
    public static void main( String[] args ) throws InterruptedException {  
        HelloWorld appiumServer = new HelloWorld();
		appiumServer.startServer();
		
		Thread.sleep(15000);
		
		appiumServer.stopServer();
        
    }
}
