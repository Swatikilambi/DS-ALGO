package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigReader {

	private static Properties properties;
	private final static String configFilePath = "./src/test/resources/config.properties";
	
	
	public static void readConfig() throws Throwable {
		
		try {
			FileInputStream fis;
			fis = new FileInputStream(configFilePath);
			properties = new Properties();
			
			try {
				
					properties.load(fis);
					fis.close();
			}catch(IOException e) {
					e.printStackTrace();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("config.properties not found at " + configFilePath);
			
		}
		
	}


	//Browser Type
	public static String getBrowserType() {
		String browser = properties.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("Browser type not specified in the config.properties file");
				
		}
	
	//Main url
	public static String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null)
			return url;
		else
			
			throw new RuntimeException("Application url not specified in the config.properties file");
	}
	
	//Homepage
	public static String getHomePageUrl() {
		String homePage = properties.getProperty("homepage");
		if(homePage != null)
			return homePage;
		else
			throw new RuntimeException("Homepage url not specified in the config.properties file");
		
	}
	
	//Register
	public static String getRegistrationPage() {
		String registrationPage = properties.getProperty("registrationPage");
		if(registrationPage != null)
			return registrationPage;
		else
			throw new RuntimeException("Registration page url not specified in the config.properties file");
			}
	
	//SignIn
	public static String getSignInPage() {
		String signInPage = properties.getProperty("Loginpage");
		if(signInPage != null)
			return signInPage;
		else
			throw new RuntimeException("Sign In page url not specified in the config.properties file");
		
	}
	
	//STACK
		//Stack_Home
	public static String getStackPageUrl() {
		String StackhomePage = properties.getProperty("Stackhome");
		if(StackhomePage != null)
			return StackhomePage;
		else
			throw new RuntimeException("StackhomePage url not specified in the config.properties file");
		
	}
		//Stack_Operations
	public static String getStackOperationsUrl() {
		String stackoperationspage=properties.getProperty("StackOp");
		if(stackoperationspage!=null)
				return stackoperationspage;
		else
			throw new RuntimeException("Stack operations url is not specified in the config.prperties file");
	}
		//Stack_Implementation
	public static String getStackImplementationUrl() {
		String stackimplementationpage=properties.getProperty("StackImp");
		if(stackimplementationpage!=null)
				return stackimplementationpage;
		else
			throw new RuntimeException("Stack Implementation url is not specified in the config.prperties file");
	}
		//Stack_Application
	public static String getStackApplicationUrl() {
		String stackapplicationpage=properties.getProperty("StackApp");
		if(stackapplicationpage!=null)
				return stackapplicationpage;
		else
			throw new RuntimeException("Stack Application url is not specified in the config.prperties file");
	}
	
		//Practice Questions
	public static String getPracticeQuestionUrl() {
		String practicequestionpage=properties.getProperty("StackPractice");
		if(practicequestionpage!=null)
				return practicequestionpage;
		else
			throw new RuntimeException("Practice Question url is not specified in the config.prperties file");
	}
	//Try_Editor
	public static String getStackTryEditorUrl() {
		String stacktryeditorpage=properties.getProperty("StackTryeditor");
		if(stacktryeditorpage!=null)
				return stacktryeditorpage;
		else
			throw new RuntimeException("Stack TryEditor url is not specified in the config.prperties file");
	
	}
	
}
