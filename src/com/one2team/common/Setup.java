package com.one2team.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author Saidani
 *
 */
public class  Setup {
	public static WebDriver driver;
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    public ExtentTest test;
    private String baseUrl;
    public static WebDriverWait wait;

    public static String navigateur; 
    /**
     * Lance le navigateur et se connecte a l'URL avant de commencer le test.
     * 
     * @beforeClass Avant la classe de test
     */
	@BeforeClass
	public void setUp() throws Exception 
	{
		extent = GenerateExtentReport.GetExtent();
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "./IEDriverServer.exe");
		
		 Properties prop = new Properties();
	        InputStream input = null;
	        
	        try {
	            input = new FileInputStream("sources/Browser.properties");
	            // load a properties file
	            prop.load(input);

	            // get the property value and print it out            
	            navigateur = prop.getProperty("Browser");
	            System.out.println("browser : " +navigateur);
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	        
	        if (navigateur.contains("FF")){
	        	DesiredCapabilities caps = new FirefoxOptions()
	        		     // For example purposes only
	        		    .setProfile(new FirefoxProfile())
	        		    .addTo(DesiredCapabilities.firefox());
	        		driver = new FirefoxDriver(caps);
	            
	            
	        }else if(navigateur.contains("GC")){
	            
	            driver = new ChromeDriver();
	            
	        }else if(navigateur.contains("IE")){
	            
	            driver = new InternetExplorerDriver();
	            
	        }

	    wait = new WebDriverWait(driver, 10);
	    
	    baseUrl = "https://chewie.one2team.com";
	    driver.get(baseUrl + "/");
	    driver.manage().window().maximize();
	}
	
	/**
     * ferme le navigateur et arrete la generation du rapport.
     * 
     * @afterClass Apres la methode de test
     */
	@AfterClass()
	public void tearDown() throws Exception 
	{
		extent.flush();
		driver.quit();
	}
	
	/**
     * ferme le navigateur et arrete la generation du rapport.
     * 
     * @afterMethod Avant la classe de test
     */
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		try
		{
			if(result.getStatus() == ITestResult.SUCCESS)
			{
				test.pass(driver.getTitle());
				System.out.println("Passed **********");
			}

			else if(result.getStatus() == ITestResult.FAILURE)
			{
				String screenShotPath = Utility.capture(driver, "screenShotName");
				test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
	            test.fail(result.getThrowable());
	            test.fail("Snapshot below: " + test.addScreenCaptureFromPath(screenShotPath));
				System.out.println("Failed ***********");
			}

			else if(result.getStatus() == ITestResult.SKIP ){

				System.out.println("Skiped***********");

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	} 
	
}
