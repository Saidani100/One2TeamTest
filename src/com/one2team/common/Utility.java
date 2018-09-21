package com.one2team.common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility
{
	WebDriver driver;
		
	/**
	 * Verifie si le texte est present.
	 * 
	 * @return True ou False.
	 */
	protected boolean isTextPresent(String text)
    {
        try{
            boolean b = driver.getPageSource().contains(text);
            return b;
        }
        catch(Exception e){
            return false;
        }
    }
    
    /**
     * recherche une jour particulier dans un calendrier.
     * 
     * @return un jour du calendrier.
     */
    public static String nDaysAfter()
    {
        String nDaysAfter = "";
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        cal.add(Calendar.DAY_OF_YEAR, 7);
        Date after = cal.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("dd");
        nDaysAfter = formatter.format(after);
        return nDaysAfter;
    }
    
    /**
     * recherche une jour particulier dans un calendrier.
     * 
     * @param driver
     * 
     * @param nom de la prise d'ecran
     * 
     * @return le destination du screenshot.
     */
   public static String capture(WebDriver driver, String screenshotName) throws IOException
    {
    	TakesScreenshot ts  = (TakesScreenshot) driver;
    	File source = ts.getScreenshotAs(OutputType.FILE);
    	String dest = System.getProperty("user.dir")+"/ErrorScreenshot/"+screenshotName+".png";
    	File destination = new File(dest);
    	FileUtils.copyFile(source, destination);
    	return dest;
    }
   
   /**
	 * Faire une capture d'ecran.
	 * 
	 * @param driver driver
	 * 
	 * @param screenshotName nom de la prise d'ecran
	 * 
	 * @return destination du screenshot.
	 * 
	 * @throws IOException exception
	 */
	public static String captureSc(WebDriver driver, String screenshotName)
	{
		TakesScreenshot ts  = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir")+"\\Screenshots\\"+screenshotName+".png";
		File destination = new File(dest);

		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dest; 
	}
    
}
