package com.one2team.controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.one2team.common.Setup;
import com.one2team.common.Utility;
import com.one2team.model.EditeurBDD;

/**
 * la classe permet de gérer les alerts.
 * 
 * @author Testing Digital
 * @version 1.0
 */
public class EditeurBDDController {
	
    private EditeurBDD EditBDD = new EditeurBDD();
   
    /**
     * Méthode pour lancer le sripte d'authentification.
     * 
     * @return une instance d'fichier html.
     */
    
    public void authentification(String Login,String Pwd, String Domaine)
   	{
   		EditBDD.getLogin().clear();
       	EditBDD.getLogin().sendKeys(Login);

   		EditBDD.getPwd().clear();		
   		EditBDD.getPwd().sendKeys(Pwd);
   		
   		EditBDD.getDomaine().clear();
   		EditBDD.getDomaine().sendKeys(Domaine);

   		EditBDD.getBtnConnect().click();
   	}
    
    /**
     * Méthode pour lancer le script d'entrer dans le module Slideboard
     * 
     * @return une instance de fichier html.
     */        
    public void entrerModuleSlideboard()
	{
		EditBDD.getModuleSlideboard().click();
	}
    
    /**
     * Méthode pour lancer le script d'authentification.
     * 
     * @return une instance d'fichier html.
     */ 
    public boolean checkHomePage()
	{
    	return EditBDD.getHomePage()!=null;
	}
	
    /**
     * Méthode pour lancer le script de création de la carte.
     * 
     * @return une instance d'fichier html.
     */
	public void createCard(String TypeObj, String Espace,  String title)
	{
		
	}	
	
	/**
     * Méthode pour lancer le script Drag&Drop Card.
     * 
     * @return une instance d'fichier html.
     */
	public void DragAndDropCard()
	{
//		System.setProperty("webdriver.chrome.driver"," E://Selenium//Selenium_Jars//chromedriver.exe ");					
//      driver= new ChromeDriver();					
//      driver.get("http://demo.guru99.com/test/drag_drop.html");				
//        
//		//Element which needs to drag.    		
//      WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
//        
//      //Element on which need to drop.		
//      WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
//        		
//      //Using Action class for drag and drop.		
//      Actions act=new Actions(driver);		
//
//		//Dragged and dropped.
//      act.dragAndDrop(From, To).build().perform();
		
	}	
	
	/**
     * Méthode pour lancer le script Uploader un fichier dans une carte.
     * 
     * @return une instance d'fichier html.
     */
	public void UploaderFileInCard()
	{

//      WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
//
//      // enter the file path onto the file-selection input field
//      uploadElement.sendKeys("C:\\newhtml.html");
//
//      // check the "I accept the terms of service" check box
//      driver.findElement(By.id("terms")).click();
//
//      // click the "UploadFile" button
//      driver.findElement(By.name("send")).click();
//      }
	}	

}
