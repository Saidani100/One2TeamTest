package com.one2team.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.one2team.common.Setup;

public class EditeurBDDAlerte {

	
	public WebElement getCreateTableAlerteDiv()
	{		
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form-create-table']/div[6]")));
	}
	
	public WebElement getCreateTableAlerteTitle()
	{		
		
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form-create-table']/div[6]/h4")));
	}
	
	public WebElement getCreateTableAlerteText()
	{		
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form-create-table']/div[6]/p[1]")));
	}
	
	public WebElement getCreateTableAlerteLink()	
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form-create-table']/div[6]/p[2]")));
	}

	//Create Alert
	public WebElement getErrAlertCreatTableDiv()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form-create-table']/div[1]/div")));	
	}
		
	public WebElement getErrAlertCreatTableTitle()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form-create-table']/div[1]/div/h4")));	
	}
	
	public WebElement getErrAlertCreatTableText(int indexTxt)
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form-create-table']/div[1]/div/ul/li["+indexTxt+"]")));
	}
	
	public WebElement getErrAlertCreatTableText()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form-create-table']/div[1]/div/ul/li")));
	}
	
	public WebElement getErrAlertText()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='form-edit-table']/table/tbody[1]/div/td")));
	}
	
	//Edit Alert
	public WebElement getErrAlertEditTableDiv()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form-edit-table']/div[1]/div")));	
	}
	
	public WebElement getErrAlertEditTableTitle()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form-edit-table']/div[1]/div/h4")));	
	}
	
	public WebElement getErrAlertEditTableText()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form-edit-table']/div[1]/div/ul/li")));
	}
	
	public WebElement getErrAlertEditTableTxt()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='form-edit-table']/div[1]/div")));
	}
	
	public WebElement getErrAlertEditNumTxt()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='form-edit-table']/table/tbody[1]/div/td")));
	}
	
	public WebElement getErrAlertEditAlphaNum()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='form-edit-table']/table/tbody[1]/div/td")));
	}
	
}
