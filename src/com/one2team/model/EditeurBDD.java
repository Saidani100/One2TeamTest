package com.one2team.model;

import com.one2team.common.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditeurBDD {

	public WebElement getHomePage()
	{
		WebElement retour = null;
		try {			
			retour = Setup.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".startpage")));
		}catch(Exception e ){
			retour = null;
		}
		return retour;
	}
	
	
	public WebElement getLogin()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userName")));
	}
	
	public WebElement getPwd()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("passWord")));
	}
	
	public WebElement getDomaine()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("domainName")));
	}
	
	public WebElement getBtnConnect()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"flogin\"]/input")));
	}
	
	public WebElement getModuleSlideboard()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("img_slideboard")));
	}
	
	// creation card part
		
	public WebElement getBtnAddCardPopIn()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/xboard/div/div[4]/div/slideboard/div/div/div/div[8]/div[1]/div[2]/div[1]/span")));
	}
	
	public WebElement getPopin()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/card-creation-popin-content-dumb")));
	}
	
	public WebElement getTypeObject()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-chosen-10")));
	}
	
	public WebElement getEspace()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select2-drop-mask")));
	}
	
	public WebElement getCardName()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cardName")));
	}
	
	public WebElement getBtnCreate()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/card-creation-popin-content-dumb/div[2]/div/button-with-status/div/div")));
	}
	
	public WebElement getBtnAnnuler()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/card-creation-popin-content-dumb/div[2]/div/button")));
	}
	
	public WebElement getDragFrom()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/card-creation-popin-content-dumb/div[2]/div/button")));
	}
	
	public WebElement getDropTo()
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/card-creation-popin-content-dumb/div[2]/div/button")));
	}
	
	public WebElement getDocumentsLinks()	
	{
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/xboard/div/div[4]/div/slideboard/div/slideboard-smart/card-modal-smart/div/div/div/div[1]/div[2]/card-modal-block-dumb[2]/div/div[2]/attachments-panel/div/div[1]/internal-attachments-section/div/div[1]/div[3]/div/a")));
	}
	
	public WebElement getCheckedDocumentsUploaded()
	{			
		return Setup.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/xboard/div/div[4]/div/slideboard/div/slideboard-smart/card-modal-smart/div/div/div/div[1]/div[2]/card-modal-block-dumb[2]/div/div[2]/attachments-panel/div/div[1]/div")));
	}

	
	//Element de l'editeur BDD 
//	public void getEditeurBDDMenu(JavascriptExecutor jse) throws InterruptedException 
//	{			
//		jse.executeScript("document.getElementsByClassName('icon-AppOutbound_DataStudio')[0].click();");
//	}
	

	
}
