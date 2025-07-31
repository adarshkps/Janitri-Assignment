package janitriLoginPage.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {
	public static File file;
	public static FileInputStream fis;
	public static Properties pro;
	public static String browser;
	public static String URL;
	public static WebDriver driver;
	public SetUp()
	{
		file=new File("./configurations/config.properties");
		try {
			fis= new FileInputStream(file);
			pro= new Properties();
			pro.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		 catch (IOException e) {
			e.printStackTrace();
		}
		browser=pro.getProperty("Browser");
		URL=pro.getProperty("URL"); 
		
	}
	public void initialization()
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("browser not found");
			return;
		}
		driver.get(URL);
	  	}
}
