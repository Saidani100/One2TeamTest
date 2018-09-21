package com.one2team.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Element;

import com.one2team.common.GenerateExtentReport;
import com.one2team.common.Setup;
import com.one2team.common.UseXmlFile;
import com.one2team.common.Utility;
import com.one2team.controllers.EditeurBDDController;
import com.one2team.model.EditeurBDD;

public class SuiteUseCase extends Setup {

//	CreateTableWithKey createTable = new CreateTableWithKey();
//
//	CreateField createField = new CreateField(8,1); 
//
//	AlertBoxControllers checkAlert = new AlertBoxControllers();

	EditeurBDD editBDDMod = new EditeurBDD();

	EditeurBDDController editBDD = new EditeurBDDController();  

	String One2TeamUrl = "https://chewie.one2team.com";

	/**
	 * 5ème
	 * Script pour la création d'une carte
	 * @test la classe de test
	 */
	@Test
	public void ScriptCreateCarte() throws InterruptedException{

		test = GenerateExtentReport.createTest("One2Team", "Verifier la connexion a l'environnement One2Team + creation d'une carte");

		Setup.driver.get(One2TeamUrl);
		Thread.sleep(4000);
		Element champs = UseXmlFile.readXMLFile("./sources/ajoutcarte.xml", "champs");
		Element compte = UseXmlFile.readXMLFile("./sources/Compte.xml", "comptes");

//		if(!editBDD.checkHomePage()) {

			// Authentification
			int indiceLogin = Integer.parseInt(compte.getElementsByTagName("compteActif").item(0).getTextContent());
			int indicePasswd = Integer.parseInt(compte.getElementsByTagName("mdpActif").item(0).getTextContent());
			int indiceDomaine = Integer.parseInt(compte.getElementsByTagName("domaineActif").item(0).getTextContent());
			
			String login = compte.getElementsByTagName("compte").item(indiceLogin).getTextContent();
			String passwd = compte.getElementsByTagName("mdp").item(indicePasswd).getTextContent();
			String domaine = compte.getElementsByTagName("domaine").item(indiceDomaine).getTextContent();
			editBDD.authentification(login, passwd,domaine);
			Thread.sleep(5000);
//		}

		// Click sur menu Module Slideboard
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.getElementsByClassName('icon-AppOutbound_DataStudio')[0].click();");
		editBDD.entrerModuleSlideboard();
		Thread.sleep(5000);


		 //Création d'une carte 
		Thread.sleep(5000);
		String typeObj = champs.getElementsByTagName("typeObject").item(0).getTextContent();
		String espace = champs.getElementsByTagName("espace").item(0).getTextContent();
		String title = champs.getElementsByTagName("titre").item(0).getTextContent();

		editBDD.createCard(typeObj,espace,title);
		Utility.captureSc(driver, "Create Card");
		

	}
	
	/**
	 * Script pour drag & drop d'une carte
	 * @test la classe de test
	 */
	
	@Test
	public void ScriptDragANDDropCard() throws InterruptedException
	{
		test = GenerateExtentReport.createTest("One2Team", "Drag and Drop d'une carte");

		// Thread.sleep(3000);
		Setup.driver.get(One2TeamUrl);
		Thread.sleep(5000);
		
//		if(!editBDD.checkHomePage()) {
//			// Authentification
//		int indiceLogin = Integer.parseInt(compte.getElementsByTagName("compteActif").item(0).getTextContent());
//		int indicePasswd = Integer.parseInt(compte.getElementsByTagName("mdpActif").item(0).getTextContent());
//		int indiceDomaine = Integer.parseInt(compte.getElementsByTagName("domaineActif").item(0).getTextContent());
//		
//		String login = compte.getElementsByTagName("compte").item(indiceLogin).getTextContent();
//		String passwd = compte.getElementsByTagName("mdp").item(indicePasswd).getTextContent();
//		String domaine = compte.getElementsByTagName("domaine").item(indiceDomaine).getTextContent();
//		editBDD.authentification(login, passwd,domaine);
//		Thread.sleep(5000);
//		}
		
		editBDD.DragAndDropCard();
		Thread.sleep(4000);
	}
	
	/**
	 * Script pour Uploader un fichier dans une carte
	 * @test la classe de test
	 */
	
	@Test
	public void ScriptUploadFileInCard() throws InterruptedException
	{
		test = GenerateExtentReport.createTest("One2Team", "Uploader un fichier dans une carte");
		
		Element data = UseXmlFile.readXMLFile("./sources/Data.xml", "data");

		// Thread.sleep(3000);
		Setup.driver.get(One2TeamUrl);
		Thread.sleep(5000);
		
//		if(!editBDD.checkHomePage()) {
//			// Authentification
//		int indiceLogin = Integer.parseInt(compte.getElementsByTagName("compteActif").item(0).getTextContent());
//		int indicePasswd = Integer.parseInt(compte.getElementsByTagName("mdpActif").item(0).getTextContent());
//		int indiceDomaine = Integer.parseInt(compte.getElementsByTagName("domaineActif").item(0).getTextContent());
//		
//		String login = compte.getElementsByTagName("compte").item(indiceLogin).getTextContent();
//		String passwd = compte.getElementsByTagName("mdp").item(indicePasswd).getTextContent();
//		String domaine = compte.getElementsByTagName("domaine").item(indiceDomaine).getTextContent();
//		editBDD.authentification(login, passwd,domaine);
//		Thread.sleep(5000);
//		}
		
		editBDD.UploaderFileInCard();
		Thread.sleep(4000);

	
	}

}