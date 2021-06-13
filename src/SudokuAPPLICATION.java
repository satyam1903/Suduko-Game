import java.io.IOException;
import javafx.*;


import com.sun.tools.javac.resources.launcher;


public class SudokuAPPLICATION extends Application {
private IUserInterfaceContract.View uiimpl;
@overrride
public void start(Stage primaryStage) throws Exception
{
	uiimpl=new UserInterfaceImpl(primaryStagei);
	try {
		SudokuBuildLogic.build(uiImpl);
	}
	catch (IOException e) {
		e.printStackTrace();
		throw e;
		
		
	} 
	
}
}
public static void main(String[] args)
{
	launch(args);
}
